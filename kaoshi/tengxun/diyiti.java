package tengxun;

import java.util.ArrayList;
import java.util.Collections;

public class diyiti {
    public static void main(String[] args) {


        int a = 2029099;
        int b = 1000;
        while (true) {
            System.out.println("现在的a为" + a);
            ArrayList<Integer> sites = new ArrayList<Integer>();
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {//a对i取余，能除尽i就是a的因子
                    sites.add(i);
                }
            }
            System.out.println(sites);

            ArrayList<Integer> list = new ArrayList<>();
            int start = sites.get(0);

            if (sites.size() < 4) {
                a = a + 1;
                continue;
            }
            for (int i = 1; i < sites.size(); i++) {
                int minus = sites.get(i) - start;
                list.add(minus);
                start = sites.get(i);
            }
            int min = Collections.min(list);

            if (min >= b) {
                System.out.println("最终的a为“" + a);
                break;
            } else {
                a = a + 1;
            }
        }
    }
}