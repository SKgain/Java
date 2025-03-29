import java.util.*;
public class ABAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = Integer.toString(n);
            int a = Integer.parseInt(String.valueOf(s.charAt(0)));
            int b = Integer.parseInt(String.valueOf(s.charAt(1)));

            System.out.println(a+b);
        }
    }
}
