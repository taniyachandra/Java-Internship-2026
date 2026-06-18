package Topic7;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length : ");
        int length = sc.nextInt();
        System.out.print("enter Breadth : ");
        int width = sc.nextInt();

        int area = length*width;
        System.out.println("Area of Rectangle:"+ area);

    }
}
