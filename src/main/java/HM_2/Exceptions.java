package HM_2;

public class Exceptions {
    public static void main(String[] args) {
        String[][] a;
        a = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            myArray4na4(a);
        } catch (MyArrayDataException e) {
            System.out.println("Не удалось сложить содержимое массива, посмотрите на корректность вводнимых данных");
        } catch (MyArraySizeException e) {
            System.out.println("Размер массива больше 4, введите корректный размер");
        }

    }

    private static void myArray4na4(String[][] strings) {
        int sum = 0;
        int[][] ints = new int[strings.length][strings.length];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (strings.length > 4) {
                    throw new MyArraySizeException();
                } else {
                    try {
                        ints[i][j] = Integer.parseInt(strings[i][j]);
                        sum += ints[i][j];
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i);
                    }
                }
            }
        }
        System.out.println(sum);
    }

}
