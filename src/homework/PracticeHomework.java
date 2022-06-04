package homework;

public class PracticeHomework {
    long convert(int minutes) {
        return minutes * 60;
    }

    int calcAge(int years) {
        return years * 365;
    }

    int nextNumber(int number) {
        return number + 1;
    }

    boolean isSameNum(int a, int b) {
        return (a == b);

    }

    boolean lessThanOrEqualToZero(int number) {
        return (number <= 0);
    }

    boolean reverseBool(boolean value) {
        return  (value == false);
        }


    int maxLengt(int[] array1, int[] array2) {
        if (array1.length >= array2.length) {
            return array1.length;
        }
        return array2.length;
    }
}
