package bankaccount;

public class Savings extends Account {
    private int safetyBoxID;
    private int safetyBoxPIN;
    public Savings(String name, String SSN, double initDeposit) {
        super(name, SSN, initDeposit);
        accountNumber = "1" + accountNumber;
        //System.out.println("New Savings Account");
        //System.out.println("Account number " + accountNumber);
        setSafetyBox();
    }
    @Override
    public void setRate(){
        rate = getBaseRate() - .25;
    }
    private void setSafetyBox(){
        safetyBoxID = (int)(Math.random()*((999-100)+1))+100;
        safetyBoxPIN = (int)(Math.random()*((9999-1000)+1))+1000;
    }
    public void showInfo() {
        super.showInfo();
        System.out.println(" Savings Account Features");
        System.out.println(" Deposit Box ID: " + safetyBoxID);
        System.out.println(" Deposit Box PIN: " + safetyBoxPIN);
    }

}
