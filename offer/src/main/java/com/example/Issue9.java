package com.example;

/**
 * 实现功能：斐波那契数列
 * <p>
 * Created by lxs on 2017/2/16 18:07.
 */

public class Issue9 {
    public static int fibonacci(int n) {
        int[] result = {0, 1};
        if (n < 2) {
            return result[n];
        }
        int fibNMinusOne = 1;
        int fibNMinusTwo = 0;
        int fibN = 0;
        for (int i = 2; i <= n; i++) {
            fibN = fibNMinusOne + fibNMinusTwo;
            fibNMinusTwo = fibNMinusOne;
            fibNMinusOne = fibN;
        }
        return fibN;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }
}
