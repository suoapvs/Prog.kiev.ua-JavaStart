package com.yurii.salimov.lesson08.task01;

/**
 * 8.1 Задача
 *
 * Вывести на экран все буквы английского алфавита.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        printEnglishAlphabet();
    }

    private static void printEnglishAlphabet() {
        printEnglishAlphabet('A', 'Z');
        printEnglishAlphabet('a', 'z');
        System.out.println();
    }

    private static void printEnglishAlphabet(final char from, final char to) {
        for (char ch = from; ch <= to; ch++) {
            System.out.print(ch + " ");
        }
    }
}
