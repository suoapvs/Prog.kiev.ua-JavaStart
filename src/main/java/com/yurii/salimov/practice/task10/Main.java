package com.yurii.salimov.practice.task10;

/**
 * P.10 Задача
 *
 * Дано два числа short1 и short2. Сделать из них один int
 * методом конкатенации с помощью побитовых операций.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final short short1 = 123;
        final short short2 = 456;
        final Concatenation concatenation = new ShortConcatenation();
        final int resultInt = concatenation.concat(short1, short2);
        System.out.println(short1 + " + " + short2 + " -> " + resultInt);
    }
}
