package chapters.chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box mayBox = new Box();
        double vol;
        mayBox.width = 10;
        mayBox.height = 5;
        mayBox.depth = 25;
        vol = mayBox.depth * mayBox.height * mayBox.width;
        System.out.println("vol = " + vol);
    }
}
