package com.yurii.salimov.practice.task08;

/**
 * P.8 Задача
 *
 * Реализовать аналог Integer.parseInt.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final String numberString = "123456789";
        final int number = MyInteger.parseInt(numberString);
        System.out.println(numberString + " - " + number);
    }
}
