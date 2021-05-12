package niukelianxi;
import java.util.HashMap;
import java.util.Map;


public class liangshuzhihe2 {
    public static void main(String[] args) {
        int[] numbers = {9, 1, 4, 8, 3, 7};
        int[] erwei =twoSum(numbers,9);
        System.out.println(erwei[0]+" "+erwei[1]);

    }

    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (hashtable.containsKey(target - numbers[i])) {
                return new int[]{i, hashtable.get(target - numbers[i])};
            }
            hashtable.put(numbers[i], i);
        }
        return new int[0];

    }
}
