package studentdatabase;

import java.util.Scanner;

public class StudentDatabase {
    public static void main(String [] args){
        /*
        Student student1 = new Student();
        student1.enroll();
        student1.showInfo();
        */
        System.out.println("How many students would you like to add?");
        Scanner in = new Scanner(System.in);
        int numStudents = in.nextInt();
        Student[] students = new Student[numStudents];
        for(int i = 0; i < numStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuiton();
            students[i].showInfo();
        }
    }
}
