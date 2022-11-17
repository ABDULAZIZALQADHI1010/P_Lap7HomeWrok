public class BasicAccountQ2 {
    private int AccountNo=0;
    private double balance=0;
    public void deposit(int amount){
        this.balance+=amount;
    }
    public void withdraw(int amount){
        if (this.balance>=amount) {
            if (amount>500){
                this.balance-=30;
                this.balance-=amount;
                System.out.println(" a penalty charge of $30 for overdraft");
            }else
                this.balance-=amount;
            System.out.println("successful withdrawal");
        }else
            System.out.println("insufficient balance");
    }
    public BasicAccountQ2(double Amount ,int AccountNo) {
        this.balance=Amount;
        this.AccountNo=AccountNo;
    }
    public double getBalance() {
        return this.balance;
    }
}
