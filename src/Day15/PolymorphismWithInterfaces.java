package Day15;
interface Payment{
    void pay();
}
class UPI implements Payment{
    public void pay(){
        System.out.println("Paid Using UPI");
    }
}
class CreditCard implements Payment{
    public void pay(){
        System.out.println("Paid Using Credit Card");
    }
}
public class PolymorphismWithInterfaces {
    public static void main(String[] args) {
        Payment p;
        p = new UPI();
        p.pay();
        p = new CreditCard();
        p.pay();
    }
}
