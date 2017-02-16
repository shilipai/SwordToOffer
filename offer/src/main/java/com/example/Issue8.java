package com.example;

/**
 * 实现功能：旋转数组的最小数字
 * {3,4,5,1,2}为{1,2,3,4,5}的一个旋转
 * <p>
 * Created by lxs on 2017/2/16 15:56.
 */

public class Issue8 {
    public static int min(int[] a) {
        int index1 = 0;
        int index2 = a.length - 1;
        int indexMid = index1;

        if (a == null || a.length <= 0) {
            //
        }
        while (a[index1] >= a[index2]) {
            if (index2 - index1 == 1) {
                indexMid = index2;
                break;
            }
            indexMid = (index1 + index2) / 2;
            if (a[index1] == a[index2] && a[index1] == a[indexMid]) {
                return min(a, index1, index2);
            }
            if (a[indexMid] >= a[index1]) {
                index1 = indexMid;
            } else if (a[indexMid] <= a[index2]) {
                index2 = indexMid;
            }
        }
        return a[indexMid];
    }

    private static int min(int[] a, int index1, int index2) {
        int result = a[index1];
        for (int i = index1 + 1; i <= index2; i++) {
            if (result >= a[i]) {
                result = a[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] a = {3, 4, 5, 1, 2};
//        System.out.println(min(a));
//        int[] b = {1, 2, 3, 4, 5};
//        System.out.println(min(b));
//        int[] c = {1, 1, 1, 0, 1};
//        System.out.println(min(c));
//        int[] d = {1, 0, 1, 1, 1};
//        System.out.println(min(d));
//        int[] e = {5};
//        System.out.println(min(e));
//        int[] f = {2,1};
//        System.out.println(min(f));
        int[] g = {1,2};
        System.out.println(min(g));
    }
}
