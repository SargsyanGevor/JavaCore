package homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'o'};
        char c = 'o';
        int ch = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                ch++;
            }
        }
        System.out.print("Masivum o eri qanake = " + ch);


        System.out.println();
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.print("Masivi mejtexi simvolnery - " + chars2[chars2.length / 2 - 1] + " " + chars2[chars2.length / 2]);


        System.out.println();
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        if (chars3[chars3.length - 1] == 'y' && chars3[chars3.length - 2] == 'l') {
            System.out.print(true);
        } else {
            System.out.print(false);
        }


        System.out.println();
        char[] bobArrey = {'j', 'a', 'n', 'l', 'b', 'b'};
        int bob = 0;
        for (int i = 0; i < bobArrey.length - 2; i++) {
            if (bobArrey[i] == 'b' && bobArrey[i + 2] == 'b') {
                bob++;
            }
        }
        if (bob > 0) {
            System.out.print(true);
        } else {
            System.out.println(false);
        }


        System.out.println();
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }
    }
}