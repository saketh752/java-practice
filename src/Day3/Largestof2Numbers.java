package Day3;
import Day2.LargestOf2Numbers;

import java.util.Scanner;
public class Largestof2Numbers {
    static int Largest(int a, int b){
        if(a>b){
            return a;
        }else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = Largest(a, b);
        System.out.println("Largest Number = " + result);
    }

}
