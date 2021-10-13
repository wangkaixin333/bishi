package qunawang

class lucklynum {
    import java.lang.reflect.Array;

    import java.util.*;

    class Solution {

        /* Write Code Here */

        public int findLuckyNumber(int[] arr) {

        }

    }

    public class Main {

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


}