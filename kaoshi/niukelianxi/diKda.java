package niukelianxi;

import java.util.PriorityQueue;

//有一个整数数组，请你根据快速排序的思路，找出数组中第K大的数。
//给定一个整数数组a,同时给定它的大小n和要找的K(K在1到n之间)，请返回第K大的数，保证答案存在。
public class diKda {
    public int findKth(int[] a, int n, int K) {
        //小根堆
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            if (pq.size() < K) {
                pq.add(a[i]);
            } else if (a[i] > pq.peek()) {
                pq.remove();
                pq.add(a[i]);
            }
        }
        return pq.peek();

    }
}
