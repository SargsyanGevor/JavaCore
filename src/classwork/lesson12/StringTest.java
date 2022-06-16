package classwork.lesson12;

import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {
        String text = "Poxos Poxosyan Poxosi";
        String[] s = text.split(" ");
        System.out.println(s[0]);
        System.out.println(s[1]);
        System.out.println(s[2]);
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }

//        String substring = text.substring(6, 14);
//        System.out.println(substring);
//        System.out.println(text.length());

//        text = text.trim();
//        System.out.println(text.toLowerCase());
//
//        String ly = "lyuhuwhdjslyssjdsdly";
//        System.out.println(ly.endsWith("j"));
//        System.out.println(ly.startsWith("ly"));
//        System.out.println(ly.contains("ly"));
    }
}
