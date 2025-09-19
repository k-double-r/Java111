package Unit1;

public class Bank {
    private int balanc=1000;
    public void withdraw(int amount){
        if(amount>balanc){
            throw new Balance("Cannot Withdraw");
        }
        else{
            balanc=balanc-amount;
            System.out.println("Withdraw Successful");
        }
    }
}
