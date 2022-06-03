package homework;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework conv = new PracticeHomework();
        int[] array1 = {4, 5, 6, 8, 12};
        int[] array2 = {6, 12, 95, 58, 98, 12, 5, 12, 98};
        System.out.println(conv.convert(1485711));
        System.out.println(conv.calcAge(5));
        System.out.println(conv.nextNumber(25));
        System.out.println(conv.isSameNum(8, 5));
        System.out.println(conv.lessThanOrEqualToZero(-15));
        System.out.println(conv.reverseBool(false));
        System.out.print(conv.maxLengt(array1,array2));
    }
}
