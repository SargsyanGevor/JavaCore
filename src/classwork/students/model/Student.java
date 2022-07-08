package classwork.students.model;

public class Student {

    private String name;
    private String surname;
    private int age;
    private String phoneNumber;
    private String city;
    private Lesson lesson;

    public Student(String name, String surname, int age, String phonrNumber, String city, Lesson lesson) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phonrNumber;
        this.city = city;
        this.lesson = lesson;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhonrNumber() {
        return phoneNumber;
    }

    public void setPhonrNumber(String phonrNumber) {
        this.phoneNumber = phonrNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", age=" + age +
                ", phonrNumber='" + phoneNumber + '\'' +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", lesson='" + lesson.getName() + '\'' +
                '}';
    }
}
