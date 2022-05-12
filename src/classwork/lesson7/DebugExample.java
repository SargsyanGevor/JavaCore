package classwork.lesson7;

public class DebugExample {
    public static void main(String[] args) {
        int[] numbers = {7, 5, 3, 8, 9};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        numbers[0] = 66;
        numbers[1] = 88;
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
    }
}
