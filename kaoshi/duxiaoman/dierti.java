package duxiaoman;

import java.util.Scanner;

public class dierti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caozuoshu = scanner.nextInt();
        String str = scanner.next();
        for (int i = 0; i < caozuoshu; i++) {
            int caozuonum = scanner.nextInt();
            if (caozuonum == 1) {
                int k = scanner.nextInt();
                str=str.substring(0, str.length() - k);

            } else if (caozuonum == 2) {
                str=new StringBuffer(str).reverse().toString();


            } else if (caozuonum == 3) {
                String strappend = scanner.next();
                str = new StringBuffer(str).append(strappend).toString();



            }
        }
        System.out.println(str);
    }


}
