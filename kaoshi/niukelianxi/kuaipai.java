package niukelianxi;

public class kuaipai {
    public static void main(String[] args) {
        System.out.println("kkk");
    }

    public int[] MySort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;
        int low = start, high = end;
        int temp = arr[low];
        while (low < high) {
            //从右边找到一个比基准值小的数
            while (low < high && temp <= arr[high]) high--;
            //从左边找到一个比基准值大的数
            while (low < high && temp >= arr[low]) low++;
            //交换这俩个数，交换完了，继续寻找比基准值小的数和比基准值大的数，交换他们
            if (low < high) {
                int t = arr[low];
                arr[low] = arr[high];
                arr[high] = t;
            }
        }
        //经过一趟遍历，比基准数小的都在左边，大的都在右边，空出了一个位置
        // 这个位置就是基准值的最终位置，将基准数放该位置
        arr[start] = arr[low];
        arr[low] = temp;
        quickSort(arr, start, low - 1);
        quickSort(arr, low + 1, end);
    }

}
