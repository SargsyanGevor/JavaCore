package chapters.chapter6;

public class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
//        System.out.print("Cavaly havasar e ");
//        System.out.println(width * height * depth);
    }
    void arkxiCaval(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
