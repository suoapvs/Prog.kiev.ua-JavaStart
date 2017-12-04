package com.yurii.salimov.lesson04.task07;

import java.util.Random;

/**
 * 4.7 Задача
 *
 * Найти в массиве число, которое повторяется
 * наибольшее количество раз. Не использовать
 * коллекции.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int length = 10;
        final int[] array = createRandomArray(length);
        final NumberArray numberArray = new NumberArrayImpl(array);
        final int maxRepetition = numberArray.maxRepetition();
        System.out.println(maxRepetition);
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
