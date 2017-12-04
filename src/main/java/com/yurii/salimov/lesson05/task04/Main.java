package com.yurii.salimov.lesson05.task04;

import java.util.Arrays;
import java.util.Random;

/**
 * 5.4 Задача
 *
 * Написать ф-ю для объединения 2-х массивов в один. Вывести
 * результат на консоль.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int length = 10;
        final int[] first = randomNumbers(length);
        final int[] second = randomNumbers(length);
        final int[] result = concat(first, second);
        print(first);
        print(second);
        print(result);
    }

    private static int[] concat(final int[] first, final int[] second) {
        final int[] result = new int[first.length + second.length];
        System.arraycopy(first, 0, result, 0, first.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

    private static int[] randomNumbers(final int length) {
        final int[] numbers = new int[length];
        final Random random = new Random();
        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt(length);
        }
        return numbers;
    }

    private static void print(final int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
