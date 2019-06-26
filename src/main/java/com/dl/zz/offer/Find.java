package com.dl.zz.offer;

/**
 *      在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 *
 * @Author zenghzong
 * @Since 2019/6/26
 * @Version 1.0
 */
public class Find {
    public boolean Find(int target, int [][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (target == anInt){
                    return true;
                }
            }
        }
        return false;
    }
}
 