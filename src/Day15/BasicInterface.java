package Day15;
interface Animal{
    public void sound();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Bark");
    }
}
public class BasicInterface {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
