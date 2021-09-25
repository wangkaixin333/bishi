package meituan;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BISHI58 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String a = read.next();
        System.out.println(lengthOfLongestSubstring(a));

    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
