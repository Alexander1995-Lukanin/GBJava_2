package HM_6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class SimpleSingleConsoleServer {
    private static final int PORT = 8189;
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    private Thread serverConsoleThread;
    LinkedList <Handler> handlers = new LinkedList<>();

    public static void main(String[] args) {
        try {
            new SimpleSingleConsoleServer().start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() throws IOException {
        ServerSocket s = new ServerSocket(PORT);
        System.out.println("Server Started");
        try {
            while (true) {
                Socket socket = s.accept();
                try {
                    handlers.add(new Handler(socket));
                 }
                catch (IOException e) {
                    socket.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            s.close();
        }
    }


    private void shutdown() throws IOException {
        if (serverConsoleThread.isAlive()) {
            serverConsoleThread.interrupt();
        }
        if (socket != null) {
            socket.close();
        }
        System.out.println("Server stopped");
    }



    public class Handler extends Thread {
        private DataInputStream in;
        private DataOutputStream out;
        private Socket socket;
        public Handler(Socket socket) throws IOException {
            this.socket=socket;
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            start();
            run();
        }
            public void run(){
                try{
                while (true) {
                    var message = in.readUTF();
                    if (message.startsWith("/end")) {
                        shutdown();
                        break;
                    }
                    System.out.println("Received: " + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    shutdown();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}