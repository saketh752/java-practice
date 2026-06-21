package Day12;
class Vehicle{
    void start(){
        System.out.println("Starting");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("Driving");
    }
}
public class ChildClassOwnMethod {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.drive();
    }
}
