package Topic5;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        if(n>0){
            System.out.println("Number is Positive.");
        } else if (n<0) {
            System.out.println("number is Negative");
        }else{
            System.out.println("Number is Zero");
        }
    }
}
