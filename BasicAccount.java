public class BasicAccount {
    private int AccountNo=0;
    private double balance=0;
    public void deposit(int amount){
        this.balance+=amount;
    }
    public void withdraw(int amount){
        if (this.balance>=amount) {
            this.balance-=amount;
            System.out.println("successful withdrawal");
        }else
            System.out.println("insufficient balance");
    }
    public BasicAccount(double Amount ,int AccountNo) {
        this.balance=Amount;
        this.AccountNo=AccountNo;
    }
    public double getBalance() {
        return this.balance;
    }
}