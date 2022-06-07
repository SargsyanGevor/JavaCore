package chapters.chapter6;

public class Stack {
    char[] stck = new char[10];
    int tos = 0;

 public void push(char item) {
        if (tos == 10) {
            System.out.println("Stack lcvac e.");
        } else
            stck[++tos] = item;
    }

    public char pop() {
        if (tos < 0) {
            System.out.println("Stack ne zagrujen");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}