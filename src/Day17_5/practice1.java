package Day17_5;
class Animal {
     Animal (){
        System.out.println("Animal Constructor");
    }
}
class Dog extends Animal {
    Dog(){
        super();
        System.out.println("Dog Constructor");
    }
}
public class practice1 {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
