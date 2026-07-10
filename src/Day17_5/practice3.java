package Day17_5;
class Person {
    void introduce() {
        System.out.println("I am a Person");
    }
}
class Student extends Person{
    void showIntroduction(){
        super.introduce();
        introduce();
    }
    void introduce() {
        System.out.println("I am a Student");
    }

}
public class practice3 {
    public static void main(String[] args) {
        Student s = new Student();
        s.showIntroduction();
    }
}
