package meituan;
import java.util.*;
import java.util.stream.Collectors;
public class fiveeightcomcity {

    public class Main {

        public static void function(char[] s, List<char[]> res) {
            // 在这里输入代码
        }

        public static void main(String[] args) {
            List<char[]> list = new ArrayList<>();
            Scanner in = new Scanner(System.in);
            while (in.hasNext()) {
                char[] chars = in.next().toCharArray();
                function(chars, list);
                System.out.println(list.stream().map(String::new).collect(Collectors.joining(",")));
            }
        }
    }
}
