package com.yurii.salimov.lesson06.task03;

import java.util.Random;

/**
 * 6.3 Задача
 *
 * Написать свой вариант ф-и Arrays.toString() для int[].
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int length = 10;
        final int[] array = randomNumbers(length);
        final ArraysToString arraysToString = new ArraysToStringImpl();
        System.out.println(arraysToString.toString(array));
    }

    private static int[] randomNumbers(final int length) {
        final int[] numbers = new int[length];
        final Random random = new Random();
        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt();
        }
        return numbers;
    }
}
