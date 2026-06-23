package Day13;
class Animal {
    void Sound() {
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal {
    void Sound(){
        System.out.println("Bark");
    }
}
public class BasicMethodOverriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.Sound();
    }
}
