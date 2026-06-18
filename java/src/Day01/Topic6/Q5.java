package Topic6;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            System.out.println(i);
        }
    }
}
