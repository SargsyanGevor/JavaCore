package chapters.chapter5;

public class MissingBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i - n poqr e 5 - ic");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i - n poqr e 10 - c");
                    break;
                default:
                    System.out.println("i - n metc kam havasar e 10 - n");
            }
        }
    }
}

