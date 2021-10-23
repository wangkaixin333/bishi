package duxiaoman;

import java.util.Scanner;

public class diyiti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jinbishu = scanner.nextInt();
        int i ;
        for ( i=1; i < 100000; i++) {

            if (jinbishu - (i * i) - 1 >= 0) {
                jinbishu = jinbishu - (i * i) - 1;

            } else {

                break;

            }
        }
        System.out.println(i-1+' '+jinbishu);
        
    }
}
