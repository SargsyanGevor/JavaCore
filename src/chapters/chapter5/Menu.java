package chapters.chapter5;

public class Menu {

    public static void main(String[] args)
            throws java.io.IOException {
        char choise;
        do {
            System.out.println("Operatori masin informacia:");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. while");
            System.out.println("4. do-while");
            System.out.println("5. for\n");
            System.out.println("yntreq tarberaky");
            choise = (char) System.in.read();
        } while (choise < '1' || choise > '5');

        System.out.println("\n");

        switch (choise) {
            case '1':
                System.out.println("if:\n");
                System.out.println("if (payman) operator:");
                System.out.println("else opertaor:");
                break;
            case '2':

        }
    }
}


