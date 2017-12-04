package com.yurii.salimov.lesson04.task04;

import java.util.Random;

/**
 * 4.4 Задача
 *
 * Дано массив из 10 целых чисел. Вывести на экран
 * сумму всех его элементов кроме первого и
 * последнего.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int length = 10;
        final int[] array = randomArray(length);
        final ArraySum arraySum = new ArraySumImpl(array);
        final int sum = arraySum.sum(1, length - 1);
        System.out.println(sum);
    }

    private static int[] randomArray(final int length) {
        final int[] array = new int[length];
        final Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }
}
