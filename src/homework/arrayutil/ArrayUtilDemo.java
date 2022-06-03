package homework.arrayutil;

public class ArrayUtilDemo {
    public static void main(String[] args) {

        ArrayUtil au = new ArrayUtil();

        int[] numbers = {2, -18, 154, 47, -189, 200, 69, 88};

        System.out.println("max = " + au.max(numbers));
        System.out.println("min = " + au.min(numbers));
        au.evenNumber(numbers);
        System.out.println();
        au.oddNumber(numbers);
        System.out.println();
        System.out.println("Even = " + au.evens(numbers));
        System.out.println("Odd = " + au.odds(numbers));
        System.out.print("Average = " + au.averageNumber(numbers) / numbers.length);
        System.out.println();
        au.arraySort(numbers);
    }
}
