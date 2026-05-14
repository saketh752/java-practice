package Day2;
import java.util.Scanner;
public class PositiveOrNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double n = sc.nextDouble();
        if(n>0){
            System.out.println("Positive");
        }else if (n==0){
            System.out.println("Zero");
        }else{
            System.out.println("Negative");
        }
    }
}
