package classwork.lesson13.dynamicArray;

public class DynamicArray {

    public int[] array = new int[10];
    private int size = 0;


    public void add(int value) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = value;
    }

    private void increaseArray() {
        int[] temp = new int[size + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];

        }
        array = temp;
    }

    void isEmpty() {
        if (size == 0) {
            System.out.println("tru");
        } else System.out.println("false");
    }

    int getByIndex(int index) {
        if (array.length > 0) {
          return array[index];
        }
        return 0;
    }

    int getFirstIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return 0;
    }

    void set(int index, int value) {
        if (index <= size) {
            array[index] = value;
        }
    }

    void add(int index, int value) {
        int[] copyArray = new int[size + 1];
        for (int i = 0; i < size; i++) {
            copyArray[i] = array[i];
        }
        for (int i = index; i < size; i++) {
            copyArray[i + 1] = array[i];
        }
        copyArray[index] = value;
        array = copyArray;
        size++;
    }

    void delete(int index) {
        for (int i = 0; i < size - index; i++) {
            array[index] = array[index + 1];
            index++;
        }
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {

            System.out.print(array[i] + " ");
        }
    }
}


