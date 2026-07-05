package Day16;

public class MultipleCatch {
    public static void main(String[] args) {
        int i = 0;
        int arr[] = {10, 20, 30};
        try{
            System.out.println(arr[5]);
            int j = 10/i;
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Error");
        }
    }
}
