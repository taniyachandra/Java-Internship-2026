package Topic6;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.format("%d X %d = %d", n, i, n * i);
            System.out.println();
        }
    }
}
