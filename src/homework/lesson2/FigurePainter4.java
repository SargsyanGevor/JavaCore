package homework.lesson2;

public class FigurePainter4 {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int j = 0; j < i + 1; j++) {
                System.out.print("  ");
            }
        }
    }
}

