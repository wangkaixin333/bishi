import java.util.Scanner;

public class ali1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        System.out.println(reverse(t));
    }
//aiyingxin

    public static int reverse(int x) {
        long sum = 0;
        while (x != 0) {
            int y = x % 10;
            sum = y + sum * 10;
            if (sum < Integer.MIN_VALUE || sum > Integer.MAX_VALUE) {
                return 0;
            }
            x = x / 10;
        }
        return (int) sum;
    }

}
