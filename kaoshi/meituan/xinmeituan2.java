package meituan;

import java.util.HashMap;
import java.util.Scanner;

public class xinmeituan2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int zushu = read.nextInt();
        int kouge = read.nextInt();
        int cout = 0;
        HashMap map = new HashMap<>();
        for (int i = 0; i < zushu; i++) {
            int yi = read.nextInt();
            int er = read.nextInt();
            int san = read.nextInt();
            int si = read.nextInt();
            if (map.containsKey(san) && (Integer) map.get(san) == san - 1) {
                cout = cout + yi;
                map.put(san, si);
            }
            else if (yi - er >= -1) {
                cout = cout + yi-er;
                map.put(san, si);
            }
        }
        System.out.println(cout);

    }
    }


