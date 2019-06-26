package com.dl.zz.offer;

/**
 *  跳台阶
 * @Author zenghzong
 * @Since 2019/6/26
 * @Version 1.0
 */
public class JumpFloor {
    public int jumpFloor(int target) {
        if (target == 1)
            return 1;
        else if (target == 2)
            return 2;
        else
            return jumpFloor(target-1)+jumpFloor(target-2);
    }
}
 