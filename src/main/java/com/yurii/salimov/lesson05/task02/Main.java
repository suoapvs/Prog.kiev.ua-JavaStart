package com.yurii.salimov.lesson05.task02;

import java.util.Arrays;
import java.util.Random;

/**
 * 5.2 Задача
 *
 * Написать функцию, которая принимает массив чисел в качестве
 * аргумента, увеличивает его первые 3 элемента на 1 и
 * возвращает их сумму как результат. После изменения массив и
 * сумму надо вывести на экран.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int length = 10;
        final int[] numbers = randomNumbers(length);
        final int sum = updateAndGetSum(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(sum);
    }

    private static int updateAndGetSum(final int[] numbers) {
        final int from = 0;
        final int to = 2;
        update(numbers, from, to);
        return sum(numbers, from, to);
    }

    private static void update(final int[] numbers, final int from, final int to) {
        for (int i = from; i <= to; i++) {
            numbers[i]++;
        }
    }

    private static int sum(final int[] numbers, final int from, final int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += numbers[i];
        }
        return sum;
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
