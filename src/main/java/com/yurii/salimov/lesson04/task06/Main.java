package com.yurii.salimov.lesson04.task06;

import java.util.Random;

/**
 * 4.6 Задача
 *
 * Найти в массиве чисел элементы с наибольшим и
 * наименьшим значениями.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int length = 10;
        final int[] array = createRandomArray(length);
        final NumberArray numberArray = new NumberArrayImpl(array);
        final int min = numberArray.min();
        final int max = numberArray.max();
        System.out.println("Min = " + min);
        System.out.println("Min = " + max);
    }

    private static int[] createRandomArray(final int length) {
        final int[] array = new int[length];
        final Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }
}
