import java.util.Scanner;

public class ToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long operations = 0;

            while (n > 0) {
                if (n % 2 == 0) {
                    // Even n: use largest possible even x (k-1 if k-1 <= n, else n)
                    long x = Math.min(k - 1, n);
                    operations += n / x;
                    n %= x;
                } else {
                    // Odd n: use largest possible odd x (k if k <= n, else n)
                    long x = Math.min(k, n);
                    operations++;
                    n -= x;
                }
            }
            System.out.println(operations);
        }
    }
}