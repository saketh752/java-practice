package Day17;
class Number {
    void checkNumber(int num) throws Exception{
        if(num < 0){
            throw new Exception ("Negative Number");
        }
    }
}
public class Using_throws {
    public static void main(String[] args) {
        Number n = new Number();
        int num = -1;
        try{
            n.checkNumber(num);
            System.out.println("Positive Number");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
