package Day3;
import java.util.Scanner;
public class AreaMethodOverloading {
    public static int area(int side){
    return side*side;
}
public static int area(int length, int breadth){
        return length*breadth;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of Square: ");
        int side = sc.nextInt();
        System.out.println("Area of the Square = " + area(side));
        System.out.println("Enter length of Rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter breadth of Rectangle: ");
        int breadth = sc.nextInt();
        System.out.println("Area of the Rectangle = " + area(length, breadth));
    }
}
