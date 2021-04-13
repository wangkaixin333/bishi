package learn;

import java.util.Scanner;

public class sumWays {
    public class numWays {
        public static void main(String[] args) {
            Scanner scan1 = new Scanner(System.in);
            int n = scan1.nextInt();
            System.out.println("请输入一个n值：");
            Ways(n);
        }
        public static int Ways(int n) {
            int a = 1, b = 1, sum;
            for (int i = 0; i < n; i++) {
                sum = (a + b) % 1000000007;
                a = b;
                b = sum;
            }
            return a;
        }
    }

}
