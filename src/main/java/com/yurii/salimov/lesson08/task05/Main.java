package com.yurii.salimov.lesson08.task05;

/**
 * 8.5 Задача
 *
 * Вычислить x^n.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        printEnglishAlphabet();
    }

    private static void printEnglishAlphabet() {
        final int x = 2;
        final int n = 10;
        final int pow = pow(x, n);
        System.out.println(x + "^" + n + " = " + pow);
    }

    private static int pow(final int x, final int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }
}
