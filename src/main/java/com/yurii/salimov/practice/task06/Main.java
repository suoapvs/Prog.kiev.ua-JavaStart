package com.yurii.salimov.practice.task06;

/**
 * P.6 Задача
 *
 * Реализовать аналог String.substring().
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final String str = "Реализовать аналог String.substring().";
        final int beginIndex = 19;
        final Substring substring = new SubstringImpl(str);
        final String subString = substring.substring(beginIndex);
        System.out.println(subString);
    }
}
