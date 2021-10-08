package ali;

import java.util.Scanner;

public class diyiti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String a = scanner.next();
            String b = scanner.next();
            int aLong = (int)Long.parseLong(a, 2);
            int bLong = (int)Long.parseLong(b, 2);
            System.out.println(aLong + bLong);
        }



    }


}
