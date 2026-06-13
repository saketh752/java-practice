package Day9;
class Students{
    static {
        System.out.println("Student Class Loaded");
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();

    }
}
