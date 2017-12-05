package com.yurii.salimov.practice.task07;

/**
 * P.7 Задача
 *
 * Реализовать аналог String.trim и trimLeft/trimRight.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final String text = "    Реализовать аналог String.trim и trimLeft/trimRight.    ";
        final Trim trim = new StringTrim(text);
        final String trimString = trim.trim();
        System.out.println(trimString);
    }
}
