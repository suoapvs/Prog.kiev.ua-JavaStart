package com.yurii.salimov.lesson08.task06;

/**
 * 8.6 Задача
 *
 * Вывести на экран все простые числа, которые меньше заданного N.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int N = 10;
        printPrimeNumbers(N);
    }

    private static void printPrimeNumbers(final int n) {
        for (int i = 1; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                isPrime &= i % j > 0;
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
