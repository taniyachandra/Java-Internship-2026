package Topic7;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal :");
        float p = sc.nextFloat();
        System.out.print("Enter Rate : ");
        float r = sc.nextFloat();
        System.out.print("Enter time : ");
        float t = sc.nextFloat();

        double SimpleInterest = (p*r*t)/100;
        System.out.println("Simple Intrest : " + SimpleInterest);
    }
}
