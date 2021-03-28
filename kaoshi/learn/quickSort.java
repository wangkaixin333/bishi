package learn;

import java.util.Arrays;
    public class quickSort {
        public static void main(String[] args) {
            int[] mySort = {12, 4, 6, 89, 3, 9};
            quickSort(mySort,0,5);
            System.out.println(Arrays.toString(mySort));//数组转化成字符串
        }

        public int[] MySort (int[] arr) {
            quickSort(arr , 0 , arr.length-1);
            return arr;
        }
        public static void quickSort(int[] list, int left, int right) {
            if (left < right) {
                // 分割数组，找到分割点
                int point = partition(list, left, right);
                // 递归调用，对左子数组进行快速排序
                quickSort(list, left, point - 1);
                // 递归调用，对右子数组进行快速排序
                quickSort(list, point + 1, right);
            }
        }
        public  static int partition(int[] list, int left, int right) {
            int first = list[left];
            while (left < right) {
                while (left < right && list[right] >= first) {
                    right--;
                }

                // 交换
                swap(list, left, right);

                while (left < right && list[left] <= first) {
                    left++;
                }

                // 交换
                swap(list, left, right);
            }
            // 返回分割点所在的位置
            return left;
        }

        private static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
