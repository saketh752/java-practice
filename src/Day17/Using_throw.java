package Day17;

public class Using_throw {
    public static void main(String[] args) {
        int Age = 15;
        if(Age < 18){
            try{
            throw new Exception("Not Eligible to vote");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("Eligible to vote");
        }
    }
}
