package HM_4;

import java.util.Arrays;

public class Multithreading {
    public static void main(String[] args) {
        singleThreaded();
        twoThreaded();
    }

    public static float[] singleThreaded() {
        final int size = 10000000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
        return arr;
    }

    public static void twoThreaded() {
        final int size = 10000000;
        final int h = size / 2;
        float[] arr2 = new float[size];
        float[] result = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 1;
        }
        System.arraycopy(arr2, 0, a1, 0, h);
        System.arraycopy(arr2, h, a2, 0, h);
        Thread one = new Thread(() -> {
            for (int i = 0; i < a1.length; i++) {
                a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        one.start();
        Thread two = new Thread(() -> {
            for (int i = 0; i < a2.length; i++) {
                a2[i] = (float) (a2[i] * Math.sin(0.2f + (i + h) / 5) * Math.cos(0.2f + (i + h) / 5) * Math.cos(0.4f + (i + h) / 2));
            }
        });
        two.start();
        try {
            one.join();
            two.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(a1, 0, result, 0, h);
        System.arraycopy(a2, 0, result, h, h);
        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
        System.out.println(Arrays.equals(result, singleThreaded()));
    }
}
