package Day9;
class Student{
    static String college = "KL University";
}
public class StaticVariable {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.college = "KL University";
        s2.college = "KL University";
        Student.college = "KLU";

        System.out.println(s1.college);
        System.out.println(s2.college);
        System.out.println(Student.college);

    }
}
