package classwork.students.storage;

import classwork.students.model.Lesson;

public class LessonStorage {

    private static Lesson[] array = new Lesson[10];
    private static int size = 0;


    public void add(Lesson lesson) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = lesson;
    }

    private void increaseArray() {
        Lesson[] temp = new Lesson[size + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];

        }
        array = temp;
    }

    public static void deleteBayIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("invalid index");
        }
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void print() {
        for (int i = 0; i < size; i++) {

            System.out.println(i + ". " + array[i]);
        }
    }


    public int getSize() {
        return size;
    }

    public Lesson getLessonBayIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }
}
    



