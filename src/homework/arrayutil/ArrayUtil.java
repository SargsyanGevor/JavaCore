package homework.arrayutil;

public class ArrayUtil {

    int max(int[] array) {
        int num = array[0];

        for (int j = 0; j < array.length; j++) {
            if (array[j] > num) {
                num = array[j];
            }
        }
        return num;
    }

    int min(int[] array) {
        int minnum = array[0];
        for (int k = 0; k < array.length; k++) {
            if (array[k] < minnum) {
                minnum = array[k];
            }
        }
        return minnum;
    }


    void evenNumber(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print("Even number = " + array[i] + " ");
            }
        }
    }

    void oddNumber(int[] array) {
        for (int d = 0; d < array.length; d++) {
            if (array[d] % 2 != 0) {
                System.out.print("Odd number = " + array[d] + " ");
            }
        }
    }

    int evens(int[] array) {
        int even = 0;
        for (int t = 0; t < array.length; t++) {
            if (array[t] % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    int odds(int[] array) {
        int odd = 0;
        for (int p = 0; p < array.length; p++) {
            if (array[p] % 2 != 0) {
                odd++;
            }
        }
        return odd;
    }

    int averageNumber(int[] array) {
        int average = 0;
        for (int v = 0; v < array.length; v++) {
            average += array[v];
            int mijin = average / array.length;
        }
        return average;
    }

    void arraySort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int min = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = min;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("Sort " +array[i] + " ");

        }
    }
}