package meituan;

import java.util.Scanner;

public class xinmeituan1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s = read.next();
        int cout = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length + 1; j++) {
                int shu = Integer.parseInt(s.substring(i, j));
                if (shu % 22 == 0) {
                    cout++;

                }
            }
        }
        System.out.println(cout);

    }
    }


