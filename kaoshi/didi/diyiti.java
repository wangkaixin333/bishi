package didi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class diyiti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        float shuzu[] = new float[N];
        for (int i = 0; i < N; i++) {
            shuzu[i] = scanner.nextFloat();
        }
        Arrays.sort(shuzu);

        int cout = 1;
        for (int i = N - 2; i >= 0; i--) {
            if (shuzu[i] != shuzu[i + 1]) {
                cout++;
            }

        }
        System.out.println(cout);

    }

}
