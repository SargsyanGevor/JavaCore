package chapters.chapter6;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box mayBox1 = new Box();
        Box mayBox2 = new Box();
        double vol;

        mayBox1.depth = 2;
        mayBox1.height = 10;
        mayBox1.width = 5;

        mayBox2.width = 3;
        mayBox2.depth = 12;
        mayBox2.height = 5;

//        vol = mayBox1.volume();
        System.out.println("Cavaly havasar e " + mayBox1.volume());

//        vol = mayBox2.volume();
        System.out.println("Cavaly havasar e " + mayBox2.volume());
    }
}
