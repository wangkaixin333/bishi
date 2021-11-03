package bianlifeng;

import java.util.Scanner;

public class diyiti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] shuzu = str.split(",");
        int intshuzu[] = new int[shuzu.length];
        for (int i = 0; i < shuzu.length; i++) {
            intshuzu[i] = Integer.parseInt(shuzu[i]);
        }
        System.out.println(massage(intshuzu));

    }

    public static int massage(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return nums[0];
        }
        int[][] dp = new int[len][2];
        dp[0][0] = 0;
        dp[0][1] = nums[0];

        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = dp[i - 1][0] + nums[i];
        }
        return Math.max(dp[len - 1][0], dp[len - 1][1]);
    }
}

