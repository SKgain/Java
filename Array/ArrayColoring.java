import java.util.*;
public class ArrayColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int sumeven = 0;
            int sumodd = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    sumeven += arr[i];
                }
               else {
                    sumodd += arr[i];
                }
            }
            if(sumeven%2==0 && sumodd%2==0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
