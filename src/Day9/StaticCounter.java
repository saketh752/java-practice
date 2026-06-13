package Day9;
class student {
    static int count = 0;
}
public class StaticCounter {
    public static void main(String[] args) {
        student s1 = new student();
        student.count++;
        student s2 = new student();
        student.count++;
                student s3 = new student();
        student.count++;

        System.out.println("Total students: " + student.count);
    }
}
