package niukelianxi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TOPKxiao {
    public ArrayList<Integer> smallestK(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (k == 0 || k > input.length) {
            return list;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < k; i++) {
            queue.offer(input[i]);
        }
        for (int i = k; i < input.length; i++) {
            if (input[i] < queue.peek()) {
                queue.poll();
                queue.offer(input[i]);

            }
        }
        for (int i = 0; i < k; i++) {
            list.add(queue.poll());
        }
        return list;
    }


}
