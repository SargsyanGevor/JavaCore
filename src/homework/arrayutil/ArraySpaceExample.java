package homework.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        int front = 0;
        int rear = 0;
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b',' ', ' '};
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != ' ') {
                front = i;
                break;
            }
        }
        for (int j = spaceArray.length - 1; j > 0; j--) {
            if (spaceArray[j] != ' ') {
                rear = j;
                break;
            }
        }
        for (int k = front; k < rear-1; k++) {
            char[] result = {spaceArray[k]};
            for (int u = 0; u < result.length; u++) {
                System.out.print(result[u]);
            }
        }
    }
}







