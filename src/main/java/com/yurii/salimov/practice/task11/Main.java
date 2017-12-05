package com.yurii.salimov.practice.task11;

import java.util.Arrays;

/**
 * P.11 Задача
 *
 * Дано два массива одинаковой длинны, упорядоченных
 * по возрастанию. Объединить массивы так, чтобы
 * получился один упорядоченный массив.
 * Пример: {1, 3, 10} + {2, 5, 8} = {1, 2, 3, 5, 8, 10}.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int[] first = {1, 3, 10};
        final int[] second = {2, 5, 8};
        final SortConcatenation sortConcatenation = new ArraySortConcatenation(first, second);
        final int[] resultArray = sortConcatenation.sortConcat();
        System.out.println(Arrays.toString(resultArray));
    }
}
