package Day4;
import java.util.Scanner;
public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        int max = n[0];
        for(int i = 1; i < n.length; i++){
            if(n[i]>max){
                max = n[i];
            }

        }
        System.out.println("Maximum Element = " + max);
    }
}
