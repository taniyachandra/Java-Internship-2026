package Topic5;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("enter num2 : ");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("Grater num is num1 : "+num1);
        }else{
            System.out.println("grater num is num2 : "+num2);
        }
    }
}
