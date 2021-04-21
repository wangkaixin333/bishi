package niukelianxi;

import java.util.Arrays;
import java.util.Scanner;

public class liangshuzhihe {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int shuzulength = read.nextInt();
        int shuzu[] = new int[shuzulength];
        for (int i = 0; i < shuzulength; i++) {
            shuzu[i] = read.nextInt();
        }
        System.out.println(Arrays.toString(twoSum(shuzu, 6)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int a[] = new int[2];
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > target) {
                continue;
            }
            for (int j = i + 1; j < numbers.length; j++) {
                if ((numbers[i] + numbers[j]) == target) {
                    a[0] = i + 1;
                    a[1] = j + 1;
                    return a;
                }
            }
        }
        return null;
    }
}
