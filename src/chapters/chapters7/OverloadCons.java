package chapters.chapters7;

public class OverloadCons {
    public static void main(String[] args) {
        Box maybox = new Box(10,20,15);
        Box maybox1 = new Box();
        Box maycube = new Box(7);

        Double vol;

        vol = maybox.volume();
        System.out.println("maybox i cavaly havasar e " + vol);

        vol = maybox1.volume();
        System.out.println("maybox1 i cavaly havasar e " + vol);

        vol = maycube.volume();
        System.out.println("maycube i cavaly havasar e " + vol);
    }
}
