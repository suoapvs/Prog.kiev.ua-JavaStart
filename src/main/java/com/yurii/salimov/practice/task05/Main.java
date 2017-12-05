package com.yurii.salimov.practice.task05;

/**
 * P.5 Задача
 *
 * Написать аналог String.indexOf().
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final String text = "Написать аналог String.indexOf().";
        final String word = "аналог";
        final Index index = new StringIndex(text);
        final int wordIndex = index.indexOf(word);
        System.out.println(wordIndex);
    }
}
