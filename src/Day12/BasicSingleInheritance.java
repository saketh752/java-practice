package Day12;
class Animal
{
    void eat(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{

}
public class BasicSingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}
