package HM_2;

public class MyArrayDataException extends ArrayIndexOutOfBoundsException {
    public MyArrayDataException(int i, int j) {
        super();
    }

    public MyArrayDataException(String s) {
        super(s);
    }

    public MyArrayDataException(int index) {
        super(index);
    }
}
