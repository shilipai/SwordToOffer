package com.example;

/**
 * 实现功能：打印1到最大的n位数
 * 3 --> 1,2,...,999
 * <p>
 * Created by lxs on 2017/2/17 15:39.
 */

public class Issue12 {
    public static void print1ToMaxOfNDigits(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid args: 位数N必须大于0");
        }
        int[] arr = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            arr[i] = 0;
        }
        if (addOne(arr)){
            printNum(arr);
        }
    }

    private static void printNum(int[] arr) {

    }

    private static boolean addOne(int[] arr) {

        return false;
    }


    public static void main(String[] args) {

    }
}
