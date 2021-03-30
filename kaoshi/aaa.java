import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        double shuzu[][] = new double[n+2][m+2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                shuzu[i][j] = scan.nextDouble();
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int jigeshu = 1;
                int he = 0;
                if (shuzu[i - 1][j] != 0) {
                    he += shuzu[i - 1][j];
                    jigeshu++;
                }
                if (shuzu[i+1][j] != 0) {
                    he += shuzu[i+1][j];
                    jigeshu++;
                }if (shuzu[i][j-1] != 0) {
                    he += shuzu[i][j-1];
                    jigeshu++;
                }if (shuzu[i][j+1] != 0) {
                    he += shuzu[i][j+1];
                    jigeshu++;
                }
                shuzu[i][j] = Math.round((he+shuzu[i][j]) / (jigeshu));
            }
        }
        
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                System.out.print((int)shuzu[i][j]+" ");
            }
            System.out.println();
        }

    }
    
    }


