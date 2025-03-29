import java.util.Scanner;
public class ServalAndStringTheory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(); // string length
            int k = sc.nextInt(); // maximum number of operation
            String s = sc.next(); // string
            String r = new StringBuilder(s).reverse().toString();


            char minChar = s.charAt(0);
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) < minChar) {
                    minChar = s.charAt(i);
                }
            }

            char maxChar = s.charAt(0);
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) > maxChar) {
                    maxChar = s.charAt(i);
                }
            }
            if (s.compareTo(r) < 0 || (k >= 1 && minChar != maxChar)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
}