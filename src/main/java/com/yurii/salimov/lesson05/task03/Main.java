package com.yurii.salimov.lesson05.task03;

import java.util.Arrays;
import java.util.Random;

/**
 * 5.3 Задача
 *
 * Написать ф-ю, которая принимает на вход массив чисел и
 * возвращает его длину в байтах как результат.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int length = 10;
        final int[] numbers = randomNumbers(length);
        final int size = sizeof(numbers);
        System.out.println(size);
    }

    private static int sizeof(final int[] numbers) {
        return numbers.length * 4;
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
