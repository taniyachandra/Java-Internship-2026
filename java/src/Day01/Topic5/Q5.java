package Topic5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("enter num2 : ");
        int num2 = sc.nextInt();
        System.out.print("enter num3 : ");
        int num3 = sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("Gratest num is num1 : "+num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("gratest num is num2 : "+num2);
        }else {
            System.out.println("Gratest num is num3 : "+num3);
        }
    }
}
