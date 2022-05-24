package chapters.chapter5;

public class IfElseIf {
    public static void main(String[] args) {
        int amis = 4;
        String exanak;
        if (amis == 12 || amis == 1 || amis == 2) {
            exanak = "dzmer";
        } else if (amis == 3 || amis == 4 || amis == 5) {
            exanak = "garun";
        } else if (amis == 6 || amis == 7 || amis == 8) {
            exanak = "amar";
        } else if (amis == 9 || amis == 10 || amis == 11) {
            exanak = "ashun";
        }else
            exanak = "ajdmisi amis chka";
        System.out.print("4 -rd amisy mtnum e " + exanak + " exanaki mej");
    }
}
