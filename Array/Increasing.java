import java.util.Arrays;
import java.util.Scanner;
public class Increasing {
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
            int flag = 0;
            for (int i = 0; i < n-1; i++) {
                if(arr[i]==arr[i+1]){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
