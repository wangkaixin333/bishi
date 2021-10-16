package boss;



import java.util.*;

public class diyiti {
    public int findK(int[] nums, int k) {
        return findKth(nums, k);
    }
    public int findKth(int[] a, int K) {
        // write code here
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            // 建堆
            buildHeap(a, i, a.length);
        }

        // 这里不是按照a.length逐次-1，是按照k的大小，即每次将大顶堆根节点换到数组末尾的时候，我就们找到第i个最大值了，i=k时就是结果；
        for (int i = 0; i < K; i++) {
            swap(a, 0, a.length - 1 - i);
            buildHeap(a, 0, a.length - 1 - i);
        }
        return  a[a.length - K];
    }

    private void buildHeap(int[] arr, int i, int len) {
        int tmp = arr[i];
        for(int j = 2 * i + 1 ; j < len; j = j * 2 + 1) {
            if (j + 1 < len && arr[j] < arr[j + 1]) {
                j++;
            }
            if (tmp < arr[j]) {
                arr[i] = arr[j];
                i = j;
            }
        }
        arr[i] = tmp;
    }

    private void swap (int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }
}
