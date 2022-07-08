package classwork.students;


import classwork.students.model.Lesson;
import classwork.students.model.Student;
import classwork.students.storage.LessonStorage;
import classwork.students.storage.StudentStorage;
import classwork.students.commands.Command;


import java.util.Scanner;

public class StudentDemo implements Command {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();

    public static void main(String[] args) {
        Lesson java = new Lesson("java", "teacher", 7, 125.5);
        Lesson php = new Lesson("php", "teacher", 8, 525.5);
        Lesson mysql = new Lesson("mysql", "teacher", 7, 125.5);
        lessonStorage.add(java);
        lessonStorage.add(php);
        lessonStorage.add(mysql);
        studentStorage.add(new Student("Petros", "Petrosyan", 35, "094111111", "Gyumri", java));
        studentStorage.add(new Student("Poxos", "POxosyan", 25, "094j11524", "Gyumri", php));
        studentStorage.add(new Student("Martiros", "Martirosyan", 40, "094111185", "Gyumri", mysql));
        boolean run = true;
        while (run) {
            Command.printCommands();
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENTS:
                    studentStorage.print();
                    break;
                case DELET_STUDENT_BY_INDEX:
                    deleteByIndex();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLessonname();
                case PRINT_STUDENT_COUNT:
                    System.out.println("students count: " + studentStorage.getSize());
                    break;
                case CHANGE_STUDENT_LESSON:
                    changeStudentLessonName();
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case PRINT_ALL_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("Invalid Comannd");

            }
        }

    }

    private static void addLesson() {
        System.out.println("Please input lesson name");
        String lessonName = scanner.nextLine();
        System.out.println("Please input teacher name");
        String teacherName = scanner.nextLine();
        System.out.println("Please input lesson duration by month");
        int duration = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input lesson price");
        double price = Double.parseDouble(scanner.nextLine());

        Lesson lesson = new Lesson(lessonName, teacherName, duration, price);
        lessonStorage.add(lesson);
        System.out.println("lesson created!");
    }

    private static void changeStudentLessonName() {
        studentStorage.print();
        System.out.println("please  choose  student index");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getStudentBayIndex(index);
        if (student == null) {
            System.out.println("Wrong Index!!!");
            changeStudentLessonName();
        } else {
            if (lessonStorage.getSize() != 0) {
                lessonStorage.print();
                System.out.println("please chose lesson index");
                int lessonIndex = Integer.parseInt(scanner.nextLine());
                Lesson lesson = lessonStorage.getLessonBayIndex(lessonIndex);
                if (lesson == null) {
                    student.setLesson(lesson);
                    System.out.println("Lesson changed!");
                }
            }
        }
    }

    private static void printStudentsByLessonname() {
        System.out.println("please input lesson name");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentsByLessonName(lessonName);
    }

    private static void deleteByIndex() {
        studentStorage.print();
        System.out.println("please  choose  student index");
        int index = Integer.parseInt(scanner.nextLine());
        StudentStorage.deleteBayIndex(index);
    }

    private static void addStudent() {

        if (lessonStorage.getSize() != 0) {
            lessonStorage.print();
            System.out.println("please chose lesson index");
            int lessonIndex = Integer.parseInt(scanner.nextLine());
            Lesson lesson = lessonStorage.getLessonBayIndex(lessonIndex);
            if (lesson == null) {
                System.out.println("Please choose correct index !!!!!");
                addStudent();
            } else {
                System.out.println("Please input student's name");
                String name = scanner.nextLine();
                System.out.println("Please input student's surname");
                String surname = scanner.nextLine();

                System.out.println("Please input student's phoneNumber");
                String phoneNumber = scanner.nextLine();
                System.out.println("Please input student's city");
                String city = scanner.nextLine();
                System.out.println("Please input student's age");
                int age = Integer.parseInt(scanner.nextLine());

                Student student = new Student(name, surname, age, phoneNumber, city, lesson);
                studentStorage.add(student);
                System.out.println("Student created");

            }

        }

    }

}
