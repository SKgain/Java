import java.util.*;
public class FairPlayoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = 4;
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int first = arr[0]; //6
            int second = arr[1]; //5
            int third = arr[2]; //3
            int fourth = arr[3]; //2

            int firstPairMax = Math.max(first, second);
            int secondPairMax = Math.max(third, fourth);

            Arrays.sort(arr);
             int max1 = arr[3];
             int max2 = arr[2];

            if(firstPairMax == max1 && secondPairMax == max2 || firstPairMax == max2 && secondPairMax == max1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
