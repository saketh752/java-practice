package Day4;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int [] n = new int [5];
        for (int i = 0; i < n.length; i++){
            n[i] = sc.nextInt();
        }
        System.out.println("Reversed Array: ");
        for(int i = n.length - 1; i >=0; i--){
            System.out.print(n[i] + " ");
        }
    }


}
