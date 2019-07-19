package com.dl.zz.sort;

/**
 *   冒泡排序
 * @Author zenghzong
 * @Since 2019/7/19
 * @Version 1.0
 */
public class BubbleSort {
    public static void bubbleSort(int [] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,6,8,9,7,1,5};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
 