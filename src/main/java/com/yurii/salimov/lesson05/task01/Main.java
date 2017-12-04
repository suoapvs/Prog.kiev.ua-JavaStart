package com.yurii.salimov.lesson05.task01;

/**
 * 5.1 Задача
 *
 * Написать функцию, которая принимает в качестве аргументов
 * одну строку X, целое число Y и число с плавающей точкой Z и
 * возвращает как результат строку в виде
 * S = x + y + z.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final String string = "String";
        final int first = 1;
        final double second = 1.1;
        final String concatString = concat(string, first, second);
        System.out.println(concatString);
    }

    private static String concat(final String string, final int first, final double second) {
        return string + first + second;
    }
}
