package chapters.chapter5;

public class Search {
    public static void main(String[] args) {
        int nums[] = { 6, 8, 3, 5, 9, 6, 1, 4 };
        int val = 0;
        boolean found = false;
        for (int x : nums){
            if (x == val){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Arjeqy gtnvac e");
        }
    }
}
