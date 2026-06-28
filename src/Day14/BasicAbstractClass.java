package Day14;
abstract class Vehicle{
    abstract void start();
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car started");
    }
}
public class BasicAbstractClass {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}
