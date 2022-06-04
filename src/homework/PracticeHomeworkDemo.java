package homework;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework conv = new PracticeHomework();
        int[] array1 = {4, 5, 6, 8, 12};
        int[] array2 = {6, 12, 95, 58, 98};
        System.out.println(conv.convert(1485711));
        System.out.println(conv.calcAge(5));
        System.out.println(conv.nextNumber(25));
        System.out.println("a = b " + conv.isSameNum(5, 5));
        System.out.println("number <= 0 " + conv.lessThanOrEqualToZero(25));
        System.out.println(conv.reverseBool(true));
        System.out.print(conv.maxLengt(array1,array2));
    }
}
