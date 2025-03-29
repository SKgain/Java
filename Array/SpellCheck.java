import java.util.*;
public class SpellCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String name = "Timur";
        char [] nameArray = name.toCharArray();
        Arrays.sort(nameArray);
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            if(n!=name.length()){
                System.out.println("NO");
            }
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            if(Arrays.equals(sArray,nameArray)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
