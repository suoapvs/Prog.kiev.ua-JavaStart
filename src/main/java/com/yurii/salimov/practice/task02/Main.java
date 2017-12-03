package com.yurii.salimov.practice.task02;

/**
 * P.2 Задача
 *
 * Построить таблицу значений ф-и на отрезке [-1; 0.75].
 * f(x) = x * (1 + 2 / (x + 7))^(x / 10)
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final double from = -1;
        final double to = 0.75;
        final double step = 0.05;
        final Function function = new MyFunction();
        final Table table = new FunctionTable(function, from, to, step);
        System.out.println(table);
    }
}
