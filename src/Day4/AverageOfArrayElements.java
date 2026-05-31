package Day4;
import java.util.Scanner;
public class AverageOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] n = new int [5];
        int sum = 0;
        System.out.println("Enter 5 numbers: ");
        for(int i = 0; i < n.length; i++){
             n[i] = sc.nextInt();
        }
        for (int i = 0; i < n.length; i++){
            sum += n[i];
        }
        double average = (double) sum / n.length;
        System.out.println("Average = " + average);
    }
}
