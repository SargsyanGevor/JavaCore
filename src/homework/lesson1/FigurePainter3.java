package homework.lesson1;

public class FigurePainter3 {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



