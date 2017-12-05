package com.yurii.salimov.lesson06.task02;

import com.yurii.salimov.lesson06.task01.DateReader;
import com.yurii.salimov.lesson06.task01.DateReaderImpl;
import com.yurii.salimov.lesson06.task01.DifferentDate;
import com.yurii.salimov.lesson06.task01.DifferentDateImpl;

import java.text.ParseException;
import java.util.Date;
import java.util.Random;

/**
 * 6.2 Задача
 *
 * Написать свой вариант ф-и Arrays.equals для short[].
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int length = 10;
        final short[] first = randomNumbers(length);
        final short[] second = randomNumbers(length);
        final ArraysEquals arraysEquals = new ArraysEqualsImpl();
        System.out.println(arraysEquals.equals(first, first));
        System.out.println(arraysEquals.equals(first, second));
    }

    private static short[] randomNumbers(final int length) {
        final short[] numbers = new short[length];
        final Random random = new Random();
        for (int i = 0; i < length; i++) {
            numbers[i] = (short) random.nextInt(Short.MAX_VALUE);
        }
        return numbers;
    }
}
