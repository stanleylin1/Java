package bankaccount;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String [] args){
        List<Account> accounts = new LinkedList<Account>();
        String file = "BankApplication/Accounts.csv";
        List<String[]> newAccounts = csv.read(file);
        /*
        Checking checkacc1 = new Checking("Tom Wilson", "213213212", 1500);
        Savings savacc1 = new Savings("Rich Lowe", "123456789", 2500);
        checkacc1.showInfo();
        System.out.println("------------------------------------------------------");
        savacc1.compound();
        savacc1.showInfo();

        savacc1.deposit(5000);
        savacc1.withdraw(200);
        savacc1.transfer("Brokerage", 3000);

         */
        for(String[] accountHolder: newAccounts){
            String name = accountHolder[0];
            String SSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            //System.out.println(name + " " + SSN + " " + accountType + " $" + initDeposit);
            if(accountType.equals("Savings")){
                //System.out.println("OPEN A SAVINGS ACCOUNT");
                accounts.add(new Savings(name, SSN, initDeposit));
            }
            else if(accountType.equals("Checking")){
                //System.out.println("OPEN A CHECKING ACCOUNT");
                accounts.add(new Checking(name, SSN, initDeposit));
            }
            else{
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }
        for(Account acc:accounts){
            acc.showInfo();
            System.out.println("-----------------------------");
        }
    }
}
