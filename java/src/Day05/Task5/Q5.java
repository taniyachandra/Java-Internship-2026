package Task5;


import java.util.Scanner;

public class Q5 {

    public static int calculateTotal(int m1, int m2, int m3, int m4, int m5) {
        return m1 + m2 + m3 + m4 + m5;
    }

    public static double calculatePercentage(int total) {
        return total / 5.0;
    }

    public static String getResult(double percentage) {
        if (percentage >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of 5 subjects:");

        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        int total = calculateTotal(m1, m2, m3, m4, m5);
        double percentage = calculatePercentage(total);

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
        System.out.println("Result = " + getResult(percentage));

        sc.close();
    }
}