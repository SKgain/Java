import java.util.*;
public class HowMuchDoesDaytonaCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int flag = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == k) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("No");
            }
            else
                System.out.println("Yes");
        }
    }
}
