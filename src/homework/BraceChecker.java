package homework;


import chapters.chapter6.Stack;

public class BraceChecker {


    public String text;

    BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            switch (a) {
                case '(':
                case '{':
                case '[':
                    stack.push(a);
                    break;
            }
            char b;
            switch (a) {
                case ')': {
                    b = stack.pop();
                    if (b == '{' || b == '[') {
                        System.out.println("Error: opened " + b + " closed ) at " + i);
                        break;
                    }
                    break;
                }
                case '}': {
                    b = stack.pop();
                    if (b == '(' || b == '[') {
                        System.out.println("Eror: openend " + b + " closed } at " + i);
                        break;
                    }
                    break;
                }
                case ']': {
                    b = stack.pop();
                    if (b == '(' || b == '{') {
                        System.out.println("Eror: openend " + b + " closed ] at " + i);
                        break;
                    }
                    break;
                }
            }
            switch (a){

            }
        }



        System.out.println("Eror: opened " + stack.pop() + " and not closed"  );
        System.out.println("Eror: opened " + stack.pop() + " and not closed"  );



    }

}

