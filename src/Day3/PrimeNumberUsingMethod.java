package Day3;
import java.util.Scanner;
public class PrimeNumberUsingMethod {
    public static boolean isPrimenumber(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean result = isPrimenumber(n);
        System.out.println(result);
    }
}
