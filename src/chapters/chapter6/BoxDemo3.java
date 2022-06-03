package chapters.chapter6;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box mayBox1 = new Box();
        Box mayBox2 = new Box();

        mayBox1.depth = 2;
        mayBox1.height = 10;
        mayBox1.width = 5;

        mayBox2.width = 3;
        mayBox2.depth = 12;
        mayBox2.height = 5;

        mayBox1.volume();

        mayBox2.volume();
    }

}
