package zijie;

import java.util.Arrays;
import java.util.Scanner;

public class diyiti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] chars = str.toCharArray();
        char[] shuzichars;
        char[] zifuchars;
        String stringBuffer1 = new String();
        String stringBuffer2 = new String();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'z') {
                stringBuffer1+= chars[i];
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                stringBuffer2+= chars[i];
            }
        }

        zifuchars = stringBuffer1.toCharArray();
        shuzichars = stringBuffer2.toCharArray();
        Arrays.sort(zifuchars);
        Arrays.sort(shuzichars);
        String stringBuffer3 = new String();
        for (int i = 0,a=0,b=shuzichars.length-1; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'z') {
                stringBuffer3+=zifuchars[a++];
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                stringBuffer3 += shuzichars[b--];
            } else {
                stringBuffer3 += "?";

            }
            
        }
        System.out.println(stringBuffer3);

    }



}
