package chapters.chapters7;

public class Overload {
    void test() {
        System.out.println("Parametrery bacakayum en");
    }

//    void test(int a, int b) {
//        System.out.println("a: " + a);
//    }

    void test(int a, int b) {
        System.out.println("a ev b: " + a + " " + b);
    }

   void test(double a) {
        System.out.println("nerqin verapoxum kanchelis test(dpuble) a: " + a);
    }
}

