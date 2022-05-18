package chapters.chapter3;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.print("za " + days);
        System.out.print(" dnei svet praideot okolo ");
        System.out.print(distance + " mil");

    }
}
