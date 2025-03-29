import java.util.Scanner;

public class MinOperations {
    public static int minOperations(int n, String s) {
        int operations = 0;
        int index = 0;

        while (index < n) {
            if (s.charAt(index) == '0' || s.charAt(index) == '1' ) {
                index++;  // Move to the next character
                operations++;
            } else {
                break;
            }
        }
        return operations;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        sc.nextLine();  // Consume the newline character

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();  // Length of the binary string
            sc.nextLine();  // Consume the newline character
            String s = sc.nextLine().trim();  // Binary string
            System.out.println(minOperations(n, s));
        }

        sc.close();
    }
}
