package Topic3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name");
        String name = sc.nextLine();
        System.out.print("Enter RollNo: ");
        int rollno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter course:");
        String course =  sc.nextLine();

        System.out.println("Student Name:"+name);
        System.out.println("Student RollNo:"+rollno);
        System.out.println("Student Course:"+course);
    }
}
