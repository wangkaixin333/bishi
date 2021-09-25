package meituan;

import java.sql.Array;
import java.util.*;

public class jingdong2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int cout = 0;
        int zhanli = 0;
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int yi = read.nextInt();
            int er = read.nextInt();
            int[] shuzu = {yi, er};
            list.add(shuzu);

            Collections.sort(list, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0]-o2[0]<0?-1:1;
                }
            });

        }
        for (int[] shuz2 : list) {
            System.out.println(shuz2[0]+" "+shuz2[1]);
            if (zhanli < shuz2[0]) {
                cout += (shuz2[0] - zhanli);
                zhanli+=(shuz2[0] - zhanli)+ shuz2[1];
            } else {
                zhanli += shuz2[1];
            }
        }
        System.out.println(cout);



    }
    }


