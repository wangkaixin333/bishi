import java.util.HashMap;
import java.util.Scanner;

/**
 * @author keboom
 * @date 2021/9/11
 */
public class Solution1 {

    static class Location {
        public int x;
        public int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        HashMap<Character, Location> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < m; j++) {
                map.put(line.charAt(j),new Location(i,j));
            }
        }
        String input = sc.next();
        Long output = 0L;
        Location lastLocation = new Location(0, 0);
        for (char c : input.toCharArray()) {
            Location location = map.get(c);
            // 如果横纵坐标相等
            if (lastLocation.x == location.x && lastLocation.y == location.y) {
                output += z;
            } else if (lastLocation.x == location.x && lastLocation.y != location.y) {
                output += Math.abs(lastLocation.y-location.y) * x;
                output += z;
            } else if (lastLocation.x != location.x && lastLocation.y == location.y) {
                output += Math.abs(lastLocation.x - location.x) * x;
                output += z;
            } else {
                output += Math.abs(lastLocation.y-location.y) * x;
                output += Math.abs(lastLocation.x - location.x) * x;
                output += y;
                output += z;
            }
            lastLocation = location;
        }
        System.out.println(output);
    }
}