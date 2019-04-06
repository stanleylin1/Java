package studentdatabase;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String year;
    private String sID;
    private String courses = "";
    private double tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("First Name: ");
        this.firstName = in.nextLine();
        System.out.println("Last Name: ");
        this.lastName = in.nextLine();
        System.out.println("Enter Year Number:\n1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior ");
        int choice = in.nextInt();
        switch(choice){
            case 1:
                this.year = "1";
                break;
            case 2:
                this.year = "2";
                break;
            case 3:
                this.year = "3";
                break;
            case 4:
                this.year = "4";
                break;
        }
        set_sID();
        //System.out.println(firstName + " " + lastName+ " " + year + " " + sID);
    }
    private void set_sID(){
        this.sID = year + "" + id;
        id++;
    }
    public void enroll(){
        do {
            System.out.println("Enter course to entroll(Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance += costOfCourse;
            }
            else{
                break;
            }
        }while(true);
        //System.out.println("ENROLLED IN: " + courses);
        //System.out.println("TUITION BAL:" + tuitionBalance);
    }
    public void viewBal(){
        System.out.println("TUITION BAL: $" + tuitionBalance);
    }
    public void payTuiton(){
        Scanner in = new Scanner(System.in);
        System.out.println("How much would you like to pay?");
        double payment = in.nextDouble();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of: $"+payment+".\nNew Balance: $"+tuitionBalance);
    }
    public void showInfo(){
        System.out.println("Name: " + firstName + " "+ lastName);
        System.out.println("Year: " + year);
        System.out.println("Student ID: " + sID);
        System.out.println("Courses: " + courses);
        System.out.println("Tuition Balance: " + tuitionBalance);
    }
}
