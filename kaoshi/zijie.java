import java.util.Scanner;

public class zijie {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int geshu = read.nextInt();
        char[] chars = read.next().toCharArray();
        for (int i = 1; i <= geshu; i++) {
            int start = read.nextInt();
            int end = read.nextInt();
            fanzhuan(chars, start - 1, end - 1);
        }
        System.out.println(chars);
    }

    public static void fanzhuan(char[] zifuchuan, int start, int end) {
        for (int j = start; j <= end; j++) {
            if (zifuchuan[j] == '0') {
                zifuchuan[j] = '1';
            } else {
                zifuchuan[j] = '0';
            }
        }

    }
}
