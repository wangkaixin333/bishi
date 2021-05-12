import java.util.Scanner;

public class ali1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for (int i = 0; i < t; i++) {
            int shu = read.nextInt();
            jisuan(shu);
        }
    }

    public static void jisuan(int n) {
        int j = (int) Math.cbrt(n);
        if (j * j * j == n) {
            System.out.println(j + " " + j);

        }
        else {
            for (int x = 0; x <= j; x++) {
                for (int y = x; y <= j; y++) {
                    if (((y * y + y) / 2) * ((y * y + y) / 2) - (((x * x + x) / 2) * ((x * x + x) / 2)) == n) {
                        System.out.println(x + 1 + " " + y);
                    }
                }
            }
        }
    }

}
