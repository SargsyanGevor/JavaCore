package chapters.chapter2;

import java.net.SocketOption;

public class Example3 {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        if (x < y) {
            System.out.println("x poqr e y ic");
        }

        x = x * 2;

        if (x == y) {
            System.out.println("hima x havasar e y in");
        }

        x = x * 2;

        if (x > y) {
            System.out.println("x hima mets e y ic");
        }

        if (x == y) {
            System.out.println("vochinch chenq tesni");
        }
    }
}
