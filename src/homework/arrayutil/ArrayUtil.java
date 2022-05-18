package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {12, 154, 525, 10, 32, 320, 11, 121, 12, 523};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = array[0];

        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
        System.out.print("Maximum number = " + max);
        System.out.println();

        int min = array[0];
        for (int k = 0; k < array.length; k++) {
            if (array[k] < min) {
                min = array[k];
            }
        }
        System.out.print("Minimum number = " + min);
        System.out.println();
        for (int l = 0; l < array.length; l++) {
            if (array[l] % 2 == 0)
                System.out.print("Even number - " + array[l] + " ");
        }
        System.out.println();
        for (int d = 0; d < array.length; d++) {
            if (array[d] % 2 != 0)
                System.out.print("Odd number - " + array[d] + " ");
        }
        System.out.println();
        int even = 0;
        for (int t = 0; t < array.length; t++) {
            if (array[t] % 2 == 0) {
                even++;
            }
        }
        System.out.print("Նumber of even numbers = " + even);
        System.out.println();
        int odd = 0;
        for (int p = 0; p < array.length; p++) {
            if (array[p] % 2 != 0) {
                odd++;
            }
        }
        System.out.print("Number of odd numbers = " + odd);
        System.out.println();
        int average = 0;
        for (int v = 0; v < array.length; v++) {
            average += array[v];
        }
        System.out.print("Average number = " + average / array.length);
    }
}

