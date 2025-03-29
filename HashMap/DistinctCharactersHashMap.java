//Distinct Characters in a String
//Problem: Given a string, count the number of distinct characters present in it.
//
//Variation: Count the number of distinct characters that appear exactly once, twice, etc.
//
//Example:
//
//Input: "banana"
//
//Output: 3 (distinct characters: 'b', 'a', 'n')

import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class DistinctCharactersHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int total = 0;
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!seen.contains(c)) {
                    total += 1;
                    seen.add(c);
                }
                else {
                    continue;
                }
            }

            System.out.println(total);

        }
    }
}
