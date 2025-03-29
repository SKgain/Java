import java.util.Scanner;
public class CreatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();

            char [] arraya = a.toCharArray();
            char [] arrayb = b.toCharArray();

            char temp = arraya[0];
            arraya[0] = arrayb[0];
            arrayb[0] = temp;

            a = new String(arraya);
            b = new String(arrayb);

            System.out.print(a + " ");
            System.out.println(b);

        }
    }
}
