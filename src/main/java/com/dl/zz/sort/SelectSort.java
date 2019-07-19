package com.dl.zz.sort;

/**
 *  选择排序
 *
 * @Author zenghzong
 * @Since 2019/7/19
 * @Version 1.0
 */
public class SelectSort {

    public static void selectSort(int arr[]) {

        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,6,8,9,7,1,5};
        selectSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}