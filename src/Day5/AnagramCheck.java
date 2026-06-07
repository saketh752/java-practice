package Day5;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "shutup";
        if (s1.length() != s2.length()) {
            System.out.println("Not a Anagram");
            return;
        }
        int[] freq = new int[256];
        int i;
        for (i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;

        }
        int j;
        for (j = 0; j < s2.length(); j++) {
            freq[s2.charAt(j)]--;
        }
        boolean isAnagram = true;
        for(int k = 0; k < freq.length; k++){
            if(freq[k] != 0){
                isAnagram = false;
                break;
            }
        }
        if(isAnagram){
            System.out.println("Anagram");
        }else{
            System.out.println("Not a Anagram");
        }
    }
}
