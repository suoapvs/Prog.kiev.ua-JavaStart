package com.yurii.salimov.lesson04.task03;

import java.util.Arrays;

/**
 * 4.3 Задача
 *
 * Заполнить массив числами от 100 до 0.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int from = 100;
        final int to = 0;

        final NumberArray numberArray = new NumberArrayImpl(from, to);
        final int[] numbers = numberArray.create();
        System.out.println(Arrays.toString(numbers));
    }
}
