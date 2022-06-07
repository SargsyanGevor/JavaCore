package chapters.chapter6;

public class Box {
    double width;
    double height;
    double depth;

    Box(){
        System.out.println("obyekti konstruktavorum");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
//        System.out.print("Cavaly havasar e ");
//        System.out.println(width * height * depth);
    }
//    void arkxiCaval(double w, double h, double d){
//        width = w;
//        height = h;
//        depth = d;
//    }
}
