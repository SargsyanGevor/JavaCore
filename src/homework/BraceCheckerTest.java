package homework;

public class BraceCheckerTest {
    public static void main(String[] args) {
        BraceChecker bc = new BraceChecker("(Hello} {Java]");

        bc.check();
    }
}