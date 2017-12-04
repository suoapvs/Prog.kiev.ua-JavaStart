package com.yurii.salimov.lesson04.task09;

import java.util.Arrays;
import java.util.Random;

/**
 * 4.9 Задача
 *
 * Написать метод для зеркального переворота
 * элементов в массиве ([1, 2, 3, 4] -> [4, 3, 2, 1]).
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int length = 5;
        final int[] array = createRandomArray(length);
        print(array);

        mirror(array);
        print(array);
    }

    public static void mirror(final int[] numbers) {
        final int length = numbers.length;
        for (int i = 0; i < (length / 2); i++) {// наприимер a=3; b=4
            numbers[i] = numbers[i] + numbers[(length - 1) - i];// a=a+b; (a=7)
            numbers[(length - 1) - i] = numbers[i] - numbers[(length - 1) - i];// b=a-b; (b=3)
            numbers[i] = numbers[i] - numbers[(length - 1) - i];// a=a-b; (a=4)
        }
    }

    private static int[] createRandomArray(final int length) {
        final int[] array = new int[length];
        final Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    private static void print(final int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
