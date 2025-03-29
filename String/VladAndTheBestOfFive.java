import java.util.Scanner;
public class VladAndTheBestOfFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int count1= 0;
            int count2= 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A') count1++;
                if (s.charAt(i) == 'B') count2++;
            }
            if (count1 > count2) System.out.println("A");
            else System.out.println("B");
        }
    }
}
