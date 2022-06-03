package chapters.chapter6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mayBox1 = new Box();
        Box mayBox2 = new Box();
        Double vol;
        mayBox1.depth = 2;
        mayBox1.height = 10;
        mayBox1.width = 5;

        mayBox2.width = 3;
        mayBox2.depth = 12;
        mayBox2.height = 5;
        vol = mayBox1.depth * mayBox1.width * mayBox1.height;
        System.out.println("vol1 = " + vol);

        vol = mayBox2.depth * mayBox2.height * mayBox2.width;
        System.out.println("vol2 = " + vol);
    }
}
