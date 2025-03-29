import java.util.*;
public class BlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    count2++;
                }
                if (arr[i] == 1) {
                    count1 = Math.max(count1, count2);
                    count2= 0 ;
                }

            }
            System.out.println(Math.max(count1, count2));
        }
    }
}
