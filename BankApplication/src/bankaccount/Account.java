package bankaccount;

public abstract class Account implements IBaseRate{
    private String name;
    private String SSN;
    private double balance;
    protected String accountNumber;
    protected double rate;
    private static int index = 10000;

    public Account(String name, String SSN, double initDeposit){
        this.name = name;
        this.SSN = SSN;
        balance = initDeposit;
        //System.out.println("Name: " + name + " " + SSN + " " + balance);
        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }
    public abstract void setRate();
    private String setAccountNumber(){
        String lastTwoSSN = SSN.substring(SSN.length()-2, SSN.length());
        int uniqueID = index;
        int randomThreeDig = (int)(Math.random()*((999-100)+ 1)) + 100;
        return lastTwoSSN + uniqueID + randomThreeDig;
    }
    public void deposit(double amount){
        System.out.println("Depositing $" + amount);
        balance+=amount;
        System.out.println("New Balance: $" + balance);
    }
    public void withdraw(double amount){
        System.out.println("Withdrawing $" + amount);
        balance-=amount;
        System.out.println("New Balance: $" + balance);
    }
    public void balance(){
        System.out.println("Balance: $" + balance);

    }
    public void compound(){
        double accruedInterest = balance * (rate/100);
        System.out.println("Accrued Interest: $" + accruedInterest);
        balance += accruedInterest;
        System.out.println("New Balance: $"+ balance);

    }
    public void transfer(String account, double amount){
        balance -= amount;
        System.out.println("Transferring $" + amount + " to " + account);
        System.out.println("New Balance: $" + balance);
    }
    public void showInfo(){
        System.out.println("Name: " + name+"\nSSN: " + SSN+"\nBalance: " + balance+"\nAccount Number: " + accountNumber +"\nRate: " + rate+"%");
        /*
        if(accountNumber.charAt(0) == '1'){
            System.out.print("Account Type: Savings");
        }
        else{
            System.out.print("Account Type: Checking");
        }
         */
    }
}
