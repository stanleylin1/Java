package bankaccount;

public class Checking extends Account{
    private String debitCardNumber;
    private int debitCardPIN;

    public Checking(String name, String SSN, double initDeposit){
        super(name, SSN, initDeposit);
        accountNumber = "2"+accountNumber;
        //System.out.println("New checking account");
        //System.out.println("Account number " + accountNumber);
        setDebitCard();
    }
    @Override
    public void setRate(){
        rate = getBaseRate()*.15;
    }
    private void setDebitCard(){
        debitCardPIN=(int)(Math.random()*((9999-1000)+1))+1000;
        int debitCardP1 = (int)(Math.random()*((999999-100000)+1))+100000;
        int debitCardP2 = (int)(Math.random()*((999999-100000)+1))+100000;
        debitCardNumber = Integer.toString(debitCardP1) + Integer.toString(debitCardP2);
    }
    public void showInfo() {
        super.showInfo();
        System.out.println(" Checking Account Features");
        System.out.println(" Debit Card Number: " + debitCardNumber);
        System.out.println(" Debit Card PIN: " + debitCardPIN);

    }
}
