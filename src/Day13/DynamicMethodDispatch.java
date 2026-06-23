package Day13;
class Vehicle {
    void start(){
        System.out.println("Vehicle Starting");
    }
}
class Car extends Vehicle{
    void start (){
        System.out.println("Car Starting");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
    }
}
