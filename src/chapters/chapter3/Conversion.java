package chapters.chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 583.9999;
        System.out.println("int popoxakani verepoxum byte popoxakani");
        b = (byte) i;
        System.out.println("i ev b " + i + " " + b);
        System.out.println("double popoxakani verapoxumy int popoxakani.");
        i = (int) d;
        System.out.println("i ev d " + i + " " + d);
        System.out.println("double popoxakani verapoxumy byte popoxakani.");
        b = (byte) d;
        System.out.println("b ev d " + b + " " + d);
    }
}
