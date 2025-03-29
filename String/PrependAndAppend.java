import java.util.Scanner;
public class PrependAndAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int count = 0;
            for (int i = 0; i < n/2; i++) {
                if (s.charAt(i) == '0' && s.charAt(n-1-i) == '1' || s.charAt(i)=='1' && s.charAt(n-1-i) == '0') {
                    count = count+2;
                }
                else {
                    break;
                }
            }
            System.out.println(n-count);
        }
    }
}
