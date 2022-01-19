package HM_2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    public MyArraySizeException() {
        super();
    }

    public MyArraySizeException(String s) {
        super(s);
    }

    public MyArraySizeException(int index) {
        super(index);
    }
}
