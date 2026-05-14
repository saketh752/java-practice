package Day2;
import java.util.Scanner;
public class LargestOf2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("A is greatest");
        }else{
            System.out.println("B is greatest");
        }
    }
}
