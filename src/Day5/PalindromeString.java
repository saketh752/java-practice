package Day5;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "java";
        String reverse = "";
        for (int i = s.length()-1; i >= 0; i--){
            s.charAt(i);
            reverse = reverse + s.charAt(i);
        }
        if(s.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
