package Day4;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements: ");
        int n[] = new int [5];
        for(int i = 0; i < n.length; i++ ){
          n[i] = sc.nextInt();
        }
        System.out.println("Enter element to search: ");
        int target = sc.nextInt();
        int index = -1;
        for(int i = 0; i < n.length; i++){
            if(n[i] == target){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.println("Found at index = " + index);
        }else{
            System.out.println("Element not found");
        }
    }
}
