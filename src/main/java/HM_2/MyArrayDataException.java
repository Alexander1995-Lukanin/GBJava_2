package HM_2;

public class MyArrayDataException extends ArrayIndexOutOfBoundsException {

    public MyArrayDataException(String s) {
        super(s);
    }

    public MyArrayDataException(int index_1, int index_2) {
        System.out.println("Ошибка в координатах "+ index_1 +" "+index_2 );
    }
}
