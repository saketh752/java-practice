package Day10;
class BankAcc{
    private String accountHolder;
    private int balance;
    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
}
public class BankAccount {
    public static void main(String[] args) {
        BankAcc b1 = new BankAcc();

        b1.setAccountHolder("Saketh");
        System.out.println("Account Holder: " + b1.getAccountHolder());
        b1.setBalance(50000);
        System.out.println("Balance: " + b1.getBalance());
    }
}
