package homework.arrayutil;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {-1, 55, 5, -9, 0, 12, 5, 3};

        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int min = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = min;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int min = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = min;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}


