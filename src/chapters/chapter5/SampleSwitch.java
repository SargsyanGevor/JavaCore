package chapters.chapter5;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i - n havasar e 0");
                    break;
                case 1:
                    System.out.println("i - n vaasar e 1");
                    break;
                case 2:
                    System.out.println("i - n havasar e 2");
                    break;
                default:
                    System.out.println("i - n metc e 2 - c");
            }
        }
    }
}
