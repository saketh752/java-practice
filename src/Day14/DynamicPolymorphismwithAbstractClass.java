package Day14;
abstract class Payment{
    abstract void pay();
}
class UPI extends Payment{
    void pay(){
        System.out.println("Paid using UPI");
    }
}
class CreditCard extends Payment{
    void pay(){
        System.out.println("Paid using CreditCard");
    }
}
public class DynamicPolymorphismwithAbstractClass {
    public static void main(String[] args) {
        Payment p;
        p = new UPI();
        p.pay();
        p = new CreditCard();
        p.pay();
    }
}
