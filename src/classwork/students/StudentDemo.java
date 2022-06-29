package classwork.students;

import java.util.Scanner;

public class StudentDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
        studentStorage.add(new Student("Petros", "Petrosyan", 35, "094111111", "Gyumri", "Java"));
        studentStorage.add(new Student("Poxos", "POxosyan", 25, "094j11524", "Gyumri", "MySql"));
        studentStorage.add(new Student("Martiros", "Martirosyan", 40, "094111185", "Gyumri", "PHP"));

        boolean run = true;
        while (run) {
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for add students");
            System.out.println("please input 2 for print all student's");
            System.out.println("please input 3 for delete all student bay index");
            System.out.println("please input 4 for student bay lesson");
            System.out.println("please input 5 for print students count");
            System.out.println("please input 6 change student's lesson");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentStorage.print();
                    break;
                case 3:
                    deleteByIndex();
                    break;
                case 4:
                    printStudentsByLessonname();
                case 5:
                    System.out.println("students count: " + studentStorage.getSize());
                    break;
                case 6:
                    changeStudentLessonName();
                    break;
                default:
                    System.out.println("Invalid Comannd");

            }
        }

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
            System.out.println("please input new lesson name");
            String newLessonName = scanner.nextLine();
            if (newLessonName != null && !newLessonName.trim().equals("")) {
                student.setLesson(newLessonName.trim());
                System.out.println("lesson name changed!");
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
        System.out.println("Please input student's name");
        String name = scanner.nextLine();
        System.out.println("Please input student's surname");
        String surname = scanner.nextLine();
        System.out.println("Please input student's age");
        String ageStr = scanner.nextLine();
        System.out.println("Please input student's phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input student's city");
        String city = scanner.nextLine();
        System.out.println("Please input student's lesso");
        String lesson = scanner.nextLine();

        int age = Integer.parseInt(ageStr);

        if (lesson != null) {
            lesson = lesson.trim();
        }

        Student student = new Student(name, surname, age, phoneNumber, city, lesson);
        studentStorage.add(student);
        System.out.println("student created");
    }

}
