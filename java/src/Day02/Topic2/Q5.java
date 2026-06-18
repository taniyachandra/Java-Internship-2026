package Topic2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.println("\n----- Student Information -----");
        System.out.println("Name      : " + name);
        System.out.println("Roll No   : " + rollNo);
        System.out.println("Course    : " + course);
        System.out.println("Age       : " + age);
    }
}