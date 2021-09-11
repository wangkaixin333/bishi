package meituan;

import java.sql.Array;
import java.util.*;

public class jingdong2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
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
            System.out.println(shuz2[0] + " " + shuz2[1]);
        }




       /* Set set=phone.keySet();
        Object[] arr=set.toArray();
        Arrays.sort(arr);
        for(Object key:arr){
            System.out.println(key);
        }*/

    }
    }


