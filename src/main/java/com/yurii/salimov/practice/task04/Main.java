package com.yurii.salimov.practice.task04;

/**
 * P.4 Задача
 *
 * Написать аналог String.replace().
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final String text = "Написать аналог String.replace().";
        final String regex = "аналог";
        final String replacement = "свой метод";
        final Replacer<String> replacer = new StringReplacer(text);
        final String replacedString = replacer.replace(regex, replacement);
        System.out.println(replacedString);
    }
}
