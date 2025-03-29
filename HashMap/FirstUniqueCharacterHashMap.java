//First Unique Character in a String
//Problem: Find the first non-repeating character in a string and return its index. If it doesn't exist, return -1.
//
//Example:
//
//Input: "leetcode"
//
//Output: 0 (first 'l' is unique)

import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class FirstUniqueCharacterHashMap {

    public int firstUniqChar(String s) {

        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Build frequency map
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FirstUniqueCharacterHashMap obj = new FirstUniqueCharacterHashMap();
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int index =obj.firstUniqChar(s);
            System.out.println(index);
        }
    }
}
