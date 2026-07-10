package Day17_5;
class Vehicle {
    String brand = "Toyota";

}
class Car extends Vehicle {
    String brand = "BMW";
    void displayBrand(){
        System.out.println(brand);
        System.out.println(super.brand);

    }
}
public class practice2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.displayBrand();
    }
}
