package Day3;
import java.util.Scanner;
public class SquareMethod {
    static int square(int n){
       int squareOfNumber =  n*n;
        return squareOfNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int result = square(n);
        System.out.println("SquareOfANumber= " + result);
    }
}
