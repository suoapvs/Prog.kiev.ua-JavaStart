package com.yurii.salimov.lesson03.task04;

import java.util.Arrays;
import java.util.Random;

/**
 * 3.4 Задача
 *
 * Среднее арифметическое элементов массива.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int length = 10;
        final int[] array = randomArray(length);
        final int arithmeticalMean = arithmeticalMean(array);
        System.out.println(Arrays.toString(array));
        System.out.println(arithmeticalMean);
    }

    private static int[] randomArray(final int length) {
        final Random random = new Random();
        final int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    private static int arithmeticalMean(final int[] array) {
        long sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (int) (sum / array.length);
    }
}
