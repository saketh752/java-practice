package Day11;
class Bank{
    String name;
    int balance;
    Bank(String name, int balance){
        this.name = name;
        this.balance = balance;
    }
}
public class MultipleParameters {
    public static void main(String[] args) {
        Bank a1 = new Bank("Saketh", 5000);
        System.out.println("Name: " + a1.name);
        System.out.println("Balance: " + a1.balance);
    }
}
