package Topic7;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num : ");
        int n = sc.nextInt();
        int count = 0;
        while(n > 0) {
            int digit = n % 10;
            count++;
            n = n / 10;
        }
        System.out.println("Total digit in number : "+ count);
    }
}
