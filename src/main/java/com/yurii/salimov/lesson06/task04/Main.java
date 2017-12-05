package com.yurii.salimov.lesson06.task04;

import java.util.Arrays;
import java.util.Random;

/**
 * 6.4 Задача
 *
 * Написать код, который позволит менять и читать значения
 * произвольных битов в массиве int-ов.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int length = 10;
        final int[] array = randomNumbers(length);
        final ArrayBitsReplacer replacer = new ArrayBitsReplacerImpl(array);

        replacer.setBit(0);
        replacer.setBit(1);
        replacer.setBit(20);

        System.out.println(replacer.isBitSet(0));
        System.out.println(replacer.isBitSet(1));
        System.out.println(replacer.isBitSet(20));
        System.out.println(replacer.isBitSet(25));
    }

    private static int[] randomNumbers(final int length) {
        final int[] numbers = new int[length];
        final Random random = new Random();
        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt(length);
        }
        return numbers;
    }
}
