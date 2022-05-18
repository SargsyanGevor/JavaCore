package chapters.chapter3;

public class Average {
    public static void main(String[] args) {
        double nums[] = {10.1, 11.2, 14.5, 18.6, 24.5};
                double result = 0;
        for (int i = 0; i < 5; i++) {
            result = result + nums[i];
            System.out.println("mijin tiv@ havasar e " + result/5);

        }
    }
}
