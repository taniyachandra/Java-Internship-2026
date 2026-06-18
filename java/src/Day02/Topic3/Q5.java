import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter marks of Subject 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter marks of Subject 3: ");
        double m3 = sc.nextDouble();

        System.out.print("Enter marks of Subject 4: ");
        double m4 = sc.nextDouble();

        System.out.print("Enter marks of Subject 5: ");
        double m5 = sc.nextDouble();

        double total = m1 + m2 + m3 + m4 + m5;
        double percentage = (total / 500) * 100;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
    }
}