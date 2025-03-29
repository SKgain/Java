//https://codeforces.com/contest/1703/problem/B

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ICPCBalloonsHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            String s = scanner.next();
            Set <Character> seen = new HashSet<>();
            int total = 0;
            for (int j = 0; j < n; j++) {
                char c = s.charAt(j);
                if (!seen.contains(c)) {
                    total += 2;
                    seen.add(c);
                } else {
                    total += 1;
                }
            }
            System.out.println(total);
        }
        scanner.close();
    }
}