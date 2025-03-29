import java.util.Scanner;
public class LoveStory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            String ts ="codeforces";
            String s = sc.next();

            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != ts.charAt(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
