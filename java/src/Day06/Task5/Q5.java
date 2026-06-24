package Task5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        String username = name.toLowerCase().replace(" ", "") + "_user";

        System.out.println("\n===== USER PROFILE =====");
        System.out.println("Name     : " + name);
        System.out.println("Email    : " + email);
        System.out.println("Username : " + username);

        sc.close();
    }
}