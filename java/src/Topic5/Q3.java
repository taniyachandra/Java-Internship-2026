package Topic5;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your marks : ");
        int marks = sc.nextInt();
        if(marks>45){
            System.out.println("You are pass.");
        }else{
            System.out.println("You are fail.");
        }
    }
}
