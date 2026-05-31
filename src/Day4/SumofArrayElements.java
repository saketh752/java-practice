package Day4;
import java.util.Scanner;
public class SumofArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] n = new int[5];
        int sum = 0;
        System.out.println("Enter 5 numbers: ");
        for(int i = 0; i < n.length; i++){
            n[i] = sc.nextInt();
        }
        for(int i = 0; i < n.length; i++) {
            sum += n[i];
        }
        System.out.print("Sum = " + sum);
    }
}
