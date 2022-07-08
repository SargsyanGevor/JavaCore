package classwork.students.commands;

public interface Command {

    public static final int EXIT = 0;
    public static final int ADD_STUDENT = 1;
    public static final int PRINT_ALL_STUDENTS = 2;
    public static final int DELET_STUDENT_BY_INDEX = 3;
    public static final int PRINT_STUDENTS_BY_LESSON = 4;
    public static final int PRINT_STUDENT_COUNT = 5;
    public static final int CHANGE_STUDENT_LESSON = 6;
    public static final int ADD_LESSON = 7;
    public static final int PRINT_ALL_LESSONS = 8;


    static void printCommands() {
        System.out.println("please input " + EXIT + " for exit");
        System.out.println("please input " + ADD_STUDENT + " for add students");
        System.out.println("please input " + PRINT_ALL_STUDENTS + " print all student's");
        System.out.println("please input " + DELET_STUDENT_BY_INDEX + " for delete all student bay index");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for student bay lesson");
        System.out.println("please input " + PRINT_STUDENT_COUNT + " for print students count");
        System.out.println("please input " + CHANGE_STUDENT_LESSON + " change student's lesson");
        System.out.println("please input " + ADD_LESSON + " for add lesson");
        System.out.println("please input " + PRINT_ALL_LESSONS + " for print all lessons");
    }
}
