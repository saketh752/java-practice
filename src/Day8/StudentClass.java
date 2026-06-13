package Day8;

class Student {
    String name;
    int marks;
}
public class StudentClass {
    public static void main(String[] args) {
        Student students = new Student();

        students.name = "Saketh";
        students.marks = 95;
        System.out.println(students.name);
        System.out.println(students.marks);
    }
}
