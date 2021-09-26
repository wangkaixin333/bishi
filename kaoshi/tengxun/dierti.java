package tengxun;

import java.util.Arrays;
import java.util.Scanner;

public class dierti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zushu = sc.nextInt();
        for (int i = 0; i < zushu; i++) {
            int geshu = sc.nextInt();
            int shuzu[] = new int[geshu];
            int fenshu[] = new int[geshu];
            for (int j = 0; j < geshu; j++) {
                shuzu[j] = sc.nextInt();
            }


            for (int x = 0; x < geshu; x++) {

                for (int j = x; j < geshu; j = j + shuzu[j]) {

                    fenshu[x] += shuzu[j];

                }
            }
            int sum = fenshu[0];
            for (int y = 0; y < fenshu.length; i++){
                if (sum < fenshu[y]){
                    sum = fenshu[y];
                }
            }
            System.out.println(sum);

        }


    }
}

