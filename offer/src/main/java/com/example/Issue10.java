package com.example;

/**
 * 实现功能：二进制中1的个数
 * <p>
 * Created by lxs on 2017/2/17 9:47.
 */

public class Issue10 {
    public static int numOfOne1(int n) { // 负数死循环
        int count = 0;
        while (n != 0) {
            if ((n & 1) != 0) {
                count++;
            }
//            n = n >> 1;
            n >>= 1;
        }
        return count;
    }

    public static int numOfOne2(int n) {
        int count = 0;
        int flag = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }

    public static int numOfOne3(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numOfOne1(11));
        System.out.println(numOfOne2(11));
        System.out.println(numOfOne3(11));
    }
}
