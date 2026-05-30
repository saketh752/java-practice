package Day3;
import java.util.Scanner;
public class MethodOverloading {
    public static int add(int a, int b) {
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int a = sc.nextInt();

        int b = sc.nextInt();

        int c = sc.nextInt();

        System.out.println("Addition of two numbers = " + add(a, b));
        System.out.println("Addition of three numbers = " + add(a, b, c));
    }
}
