package Day16;

public class Basictry_catch {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        try{
            j = 10/i;
        }
        catch(Exception e){
            System.out.println("Cannot divided by zero");
        }
    }
}
