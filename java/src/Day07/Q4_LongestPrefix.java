import java.util.*;

public class Q4_LongestPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        String prefix = strs[0];

        for (int i = 1; i < n; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty())
                    break;
            }
        }

        System.out.println(prefix);
    }
}