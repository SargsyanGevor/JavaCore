package chapters.chapter3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b = false;
        System.out.println("b havasar e " + b);
        b = true;
        System.out.println("b havasar e " + b);

        if (b) System.out.println("Ays kod kashxati");
        b = false;
        if (b) System.out.println("Ays kod chi ashxati");

        System.out.println("\\10 > 9 hava\nsar e " + (10 < 9));
        System.out.println("10 > 9 havasar e " + (10 > 9));
        System.out.println(b);
    }
}
