package classwork.students;

public class StudentStorage {

    private static Student[] array = new Student[10];
    private static int size = 0;


    public void add(Student student) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = student;
    }

    private void increaseArray() {
        Student[] temp = new Student[size + 10];
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

    public void printStudentsByLessonName(String lessonName) {

        for (int i = 0; i < size; i++) {
            if (array[i].getLesson().equals(lessonName)) {
                System.out.println(array[i]);
            }

        }

    }


    public int getSize() {
        return size;
    }

    public Student getStudentBayIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }
}
    



