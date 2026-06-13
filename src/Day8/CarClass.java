package Day8;
class Car{
    String brand;
    int speed;
}
public class CarClass {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.brand = "BMW";
        c1.speed = 220;

        c2.brand = "Audi";
        c2.speed =  200;

        System.out.println(c1.brand + " " + c1.speed);
        System.out.println(c2.brand + " " + c2.speed);
    }
}
