import java.util.Arrays;
import java.util.Scanner;
public class EqualCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int min = arr[0];
            int candiToGiven = min * n;

            int totalCandi = 0;
            for (int i = 0; i < n; i++) {
                totalCandi += arr[i];
            }

            System.out.println(totalCandi-candiToGiven);
        }
    }
}
