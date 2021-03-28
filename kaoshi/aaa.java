import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int k = read.nextInt();
        int shuzu[] = new int[n];
        int kuaile = 0;
        for (int i = 0; i < n; i++) {
            shuzu[i] = read.nextInt();
        }
        Arrays.sort(shuzu);
        for (int i = 0; i < n; i++) {
            if (shuzu[i] > 0) {
                kuaile += shuzu[i];
            }

        }
    }




}
