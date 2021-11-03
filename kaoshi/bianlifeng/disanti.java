package bianlifeng;

import java.util.*;

class disanti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replace("[", "");
        str = str.replace("]", "");
        String[] shuzu = str.split(",");
        int[][] points = new int[shuzu.length / 2][];
        for (int i = 0, j = 0; i < shuzu.length / 2; i++, j = j + 2) {
            points[i] = new int[]{Integer.parseInt(shuzu[j]), Integer.parseInt(shuzu[j + 1])};

        }
        System.out.println(minAreaRect(points));

    }

    public static int minAreaRect(int[][] points) {
        Map<Integer, List<Integer>> rows = new TreeMap();
        for (int[] point : points) {
            int x = point[0], y = point[1];
            rows.computeIfAbsent(x, z -> new ArrayList()).add(y);
        }

        int ans = Integer.MAX_VALUE;
        Map<Integer, Integer> lastx = new HashMap();
        for (int x : rows.keySet()) {
            List<Integer> row = rows.get(x);
            Collections.sort(row);
            for (int i = 0; i < row.size(); ++i)
                for (int j = i + 1; j < row.size(); ++j) {
                    int y1 = row.get(i), y2 = row.get(j);
                    int code = 40001 * y1 + y2;
                    if (lastx.containsKey(code))
                        ans = Math.min(ans, (x - lastx.get(code)) * (y2 - y1));
                    lastx.put(code, x);
                }
        }

        return ans < Integer.MAX_VALUE ? ans : 0;
    }
}


