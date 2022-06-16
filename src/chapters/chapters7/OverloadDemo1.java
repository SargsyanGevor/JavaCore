package chapters.chapters7;

public class OverloadDemo1 {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int i = 88;
        ob.test();
        ob.test(12,25);
        ob.test(i);

        ob.test(153.98);

    }

}
