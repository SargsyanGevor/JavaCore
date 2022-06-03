package chapters.chapter6;

public class Stack {
    int [] array = new int[10];
    int index;

    Stack(){
        index = -1;
    }

    void push (int value){
        array[++index] = value;
    }


}