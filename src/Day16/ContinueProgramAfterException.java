package Day16;

public class ContinueProgramAfterException {
    public static void main(String[] args) {
        System.out.println("Program Started");
        int i = 0;
        try{
            int j = 10/i;
        }
        catch (Exception e){
            System.out.println("Exception Handled");
        }
        System.out.println("Program Ended");
    }
}
