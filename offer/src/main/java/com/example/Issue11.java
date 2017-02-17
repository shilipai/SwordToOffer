package com.example;

/**
 * 实现功能：
 * <p>
 * Created by lxs on 2017/2/17 11:40.
 */

public class Issue11 {

    public static double power(double base, int exponent) {
        if (equal(base, 0) && (exponent < 0)) {
            throw new IllegalArgumentException("Invalid args");
        }
        int absExponent = (exponent < 0) ? -exponent : exponent;
//        double result = powerWithPositiveExponent(base, absExponent);
        double result = powerWithPositiveExponentOptimize(base, absExponent);
        result = (exponent < 0) ? 1 / result : result;
        return result;
    }

    private static double powerWithPositiveExponent(double base, int exponent) {
        double result = 1;
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }

    /**
     *  a^n = a^n/2 * a^n/2 (n为偶)
     *  a^n = a^(n-1)/2 * a^(n-1)/2 * a (n为奇)
     * @param base
     * @param exponent
     * @return
     */
    private static double powerWithPositiveExponentOptimize(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        }
        double result = powerWithPositiveExponentOptimize(base, exponent >> 1);
        result *= result;
        if ((exponent & 1) != 0) {
            result *= base;
        }
        return result;
    }

    private static boolean equal(double num1, double num2) {
        return (((num1 - num2) > -0.0000001) && ((num1 - num2) < 0.0000001)) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(power(0, 0));
        System.out.println(power(0, 1));
        System.out.println(power(2, 3));
        System.out.println(power(2, -3));

    }
}
