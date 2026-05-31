package Day4;
import java.util.Scanner;
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int[] n = new int[5];
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        int largest = n[0];
        int secondLargest = n[0];
        for(int i = 0; i < n.length; i++){
            if (n[i] > largest){
                secondLargest = largest;
                largest = n[i];
            }else if (n[i] > secondLargest){
                secondLargest = n[i];
            }
        }
        System.out.println("Second Largest = " + secondLargest);
    }
}