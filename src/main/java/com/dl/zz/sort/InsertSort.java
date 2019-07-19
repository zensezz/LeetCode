package com.dl.zz.sort;

/**
 * 插入排序
 * @Author zenghzong
 * @Since 2019/7/19
 * @Version 1.0
 */
public class InsertSort {

    public static void  insertSort(int arr[]){
        int temp ;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1;j>0;j--){
                if (arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,6,8,9,7,1,5};
        insertSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
 