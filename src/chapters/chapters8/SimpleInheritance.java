package chapters.chapters8;

public class SimpleInheritance {

    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("superOb obekty parunakum e: " );
        superOb.showij();
        System.out.println();

        subOb.i = 3;
        subOb.j = 4;
        subOb.k = 5;
        System.out.println("subOb obeykty parunakum e: ");
        subOb.showij();
        subOb.showk();
        System.out.println();

        System.out.println("subOb obyektum i, j, k hanragumary: ");
        subOb.sum();

    }

}
