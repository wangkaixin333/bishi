package tengxun;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.Scanner;
import java.util.*;

public class Charstr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        List<String> list = new ArrayList<>();
        char[] arr = str.ToCharArray();
        String s = sort(str);
        System.out.println(s);

    }

    private static String sort(char[] arr) {
        TreeSet<Charstr> ts = new TreeSet<>(new Comparator<Charstr>() {
            @Override
            public int compare(Charstr o1, Charstr o2) {
                int num = o1.compareTo(o2);
                return num == 0 ? 1 : num;
            }
        });
        for (char c : arr) {
            ts.add(c);
        }
        System.out.print("排序后的字符串");
        for (Charstr t : ts) {
            System.out.println(t + "");
        }
    }
}