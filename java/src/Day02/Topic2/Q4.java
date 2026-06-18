package Topic2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter marks of Subject 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter marks of Subject 3: ");
        double m3 = sc.nextDouble();

        double average = (m1 + m2 + m3) / 3;

        System.out.println("Average Marks = " + average);
    }
}