package com.dl.zz.offer;

/**
 *  变态跳台阶
 * @Author zenghzong
 * @Since 2019/6/26
 * @Version 1.0
 */
public class JumpFloor2 {
    public int JumpFloor2(int target) {
        if (target ==1)
            return 1;
        else if(target==2)
            return 2;
        else
            return JumpFloor2(target-1)*2;
    }
}
 