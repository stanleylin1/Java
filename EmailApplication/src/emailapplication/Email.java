package emailapplication;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail = "alternate@email.com";
    private String companyName = "Company";

    public Email(String firstName, String lastName){ //local variables
        this.firstName = firstName; //this refers to class level variable
        this.lastName = lastName;

        //System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
        this.department = setDepartment();

        //System.out.println("Department: " + this.department);
        if(department.equals("")) {
            this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + companyName.toLowerCase() + ".com";
        }
        else{
            this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companyName.toLowerCase() + ".com";
        }
        //System.out.println("Your email is: "+ email);


        this.password = genPassword(defaultPasswordLength);
        //System.out.println("Your password is: " + this.password);

    }
    private String setDepartment() {
        System.out.println("New Employee: " + this.firstName +" "+ this.lastName);
        System.out.println("Enter the department code: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for None");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if(choice == 1){
            return "Sales";
        }
        else if(choice == 2){
            return "Development";
        }
        else if(choice == 3){
            return "Accounting";
        }
        else
            return "";
    }
    private String genPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
           int randomNum= (int)(Math.random()*passwordSet.length());
           //System.out.println("Random num: " + randomNum);
           password[i] = passwordSet.charAt(randomNum);
        }
        return new String(password);
    }

    public void setMailCapacity(int capacity){
        this.mailCapacity = capacity;
    }
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }
    public void changePassword(String password){
        this.password = password;
    }
    public String getAlternateEmail(){
        return this.alternateEmail;
    }
    public int getMailboxCapacity(){
        return this.mailCapacity;
    }
    public String getPassword(){
        return this.password;
    }
    public void showInfo(){
        System.out.println("Full Name: " + firstName +" "+ lastName);
        System.out.println("Company: " + companyName);
        System.out.println("Department: " + department);
        System.out.println("Email Address: " + email);
        System.out.println("Alternate Email Address: "+ alternateEmail);
        System.out.println("Email Mailbox Capacity: " + mailCapacity + "MB");
        System.out.println("Passowrd: " +password);
    }
}

