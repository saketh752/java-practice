package Day10;
class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class BasicEncapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Saketh");
        System.out.println(s1.getName());
    }

}
