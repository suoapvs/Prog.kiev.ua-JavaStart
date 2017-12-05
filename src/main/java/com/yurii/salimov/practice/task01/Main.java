package com.yurii.salimov.practice.task01;

import java.util.Arrays;
import java.util.Random;

/**
 * P.1 Задача
 *
 * Найти все уникальные (не повторяющиеся) элементы массива.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int length = 100;
        final int[] array = randomArray(length);
        final UniqueArray uniqueArray = new MyArray(array);
        final int[] resultArray = uniqueArray.unique();
        System.out.println(Arrays.toString(resultArray));
    }

    private static int[] randomArray(final int length) {
        final int[] array = new int[length];
        final Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(length / 2);
        }
        return array;
    }
}
