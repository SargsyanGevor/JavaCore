package chapters.chapter6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box mayBox1 = new Box();
        Box mayBox2 = new Box();

        double vol;

//        mayBox1.arkxiCaval(10,100,15);
//        mayBox2.arkxiCaval(15,4,9);

        vol = mayBox1.volume();
        System.out.println("Cavaly havasar e " + vol);

        vol = mayBox2.volume();
        System.out.println("Cavaly havasar e " + vol);
    }
}
