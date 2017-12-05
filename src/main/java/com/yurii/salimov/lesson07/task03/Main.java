package com.yurii.salimov.lesson07.task03;

import java.util.Arrays;
import java.util.Random;

/**
 * 7.3 Задача
 *
 * Дано 3 массива чисел. С помощью 1-2-х циклов найти
 * сумму элементов во всех массивах.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int length = 10;
        final int[] first = randomNumbers(length);
        final int[] second = randomNumbers(length * 2);
        final int[] third = randomNumbers(length * 3);
        final int sum = sum(first, second, third);
        System.out.println("First: " + Arrays.toString(first));
        System.out.println("Second: " + Arrays.toString(second));
        System.out.println("Third: " + Arrays.toString(third));
        System.out.println("Sum = " + sum);
    }

    private static int sum(final int[] first, final int[] second, final int[] third) {
        final int[][] allArrays = {first, second, third};
        int sum = 0;
        for (int[] array : allArrays) {
            for (int number : array) {
                sum += number;
            }
        }
        return sum;
    }

    private static int[] randomNumbers(final int length) {
        final int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = i;
        }
        return numbers;
    }
}
