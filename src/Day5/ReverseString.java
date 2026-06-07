package Day5;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        String s = new String("java");
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s.charAt(i);
            reverse = reverse + s.charAt(i);

        }
        System.out.println(reverse);
    }

    }
