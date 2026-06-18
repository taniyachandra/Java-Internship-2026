import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        if (marks >= 33) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}