package niukelianxi;
/*给定一个数组arr，返回子数组的最大累加和
   例如，arr = [1, -2, 3, 5, -2, 6, -1]，所有子数组中，[3, 5, -2, 6]可以累加出最大的和12，所以返回12.
   题目保证没有全为负数的数据
   要求时间复杂度为O(n)O(n)，空间复杂度为O(1)O(1)*/
public class zuidazushuzuhe {
    public int maxsumofSubarray(int[] arr) {
        // write code here
        int max = arr[0];
        int former = 0;//用于记录dp[i-1]的值，对于dp[0]而言，其前面的dp[-1]=0
        int cur = arr[0];//用于记录dp[i]的值
        for (int num : arr) {
            cur = num;
            if (former > 0) cur += former;
            former = cur;
            if (cur > max) max = cur;
        }
        return max;
    }
}

