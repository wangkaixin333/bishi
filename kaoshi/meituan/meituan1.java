package meituan;

import java.util.Scanner;

public class meituan1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int zushu = read.nextInt();
        for (int j = 0; j <= zushu; j++) {
            int a = read.nextInt();
            int b = read.nextInt();
            jisuan(a, b);
        }

    }

    public static void jisuan(int a, int b) {
        if (a == b) {
            System.out.println(0);
        }else {
            int min = Math.min(a, b);
            int max = Math.max(a, b);
            int i;
            for (i = 1; min < max; i++) {
                min = min + i;
            }
            if (min == max) {
                System.out.println(i-1);
            } else {
                i--;
                min = min - i;
                System.out.println(i-1+((max - min) * 2));
            }
        }


    }



}
