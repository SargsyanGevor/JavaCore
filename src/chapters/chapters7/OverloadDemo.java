package chapters.chapters7;

public class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        double result;

        ob.test();
        ob.test(10, 25);
        ob.test(10);
//        result = ob.test(123.25);
        System.out.println("Rezulytat vivoda ob.test(12.25): ");

    }
}
