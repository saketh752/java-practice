package Day5;

public class CharacterFrequency {
    public static void main(String[] args) {
        String s = "banana";

        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            freq[c]++;
        }
        System.out.println(freq['a']);
        System.out.println(freq['n']);
        System.out.println(freq['b']);
    }
}
