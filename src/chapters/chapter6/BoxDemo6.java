package chapters.chapter6;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box maybox1 = new Box();
        Box maybox2 = new Box();

        double vol;

        vol = maybox1.volume();
        System.out.println("Cavaly havasar e " + vol);

        vol = maybox2.volume();
        System.out.println("Cavaly havasar e " + vol);
    }
}
