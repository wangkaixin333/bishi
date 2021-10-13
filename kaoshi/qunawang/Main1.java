package qunawang;

import java.lang.reflect.Array;
import java.util.*;


class Solution {

    /* Write Code Here */

    public int findLuckyNumber(int[] arr) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int x : arr) {
            m.put(x, m.getOrDefault(x, 0) + 1);
        }
        int ans = -1;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            int key = entry.getKey(), value = entry.getValue();
            if (key == value) {
                ans = Math.max(ans, key);
            }
        }
        return ans;


    }

}

public class Main1 {

    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);

        int[] res;

        while (sc.hasNext()){

            String s = sc.nextLine();

            String[] str = s.split(",");

            int[] a = new int[str.length];

            for(int i = 0; i<str.length; i++){

                a[i] = Integer.parseInt((str[i]));

            }

            Solution sl = new Solution();

            System.out.println(sl.findLuckyNumber(a));

        }

    }

}
