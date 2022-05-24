package chapters.chapter5;

public class Switch {
    public static void main(String[] args) {
        int amis = 4;
        String exanak;
        switch (amis) {
            case 12:
            case 1:
            case 2:
                exanak = "dzmer";
                break;
            case 3:
            case 4:
            case 5:
                exanak = "garun";
                break;
            case 6:
            case 7:
            case 8:
                exanak = "amar";
                break;
            case 9:
            case 10:
            case 11:
                exanak = "ashun";
                break;
            default:
                exanak = "aydpisi amis chka";
        }
        System.out.print("4 - rd amisy patkanum e " + exanak + " exanakin");
    }
}
