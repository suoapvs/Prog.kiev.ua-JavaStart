package com.yurii.salimov.lesson04.task00;

/**
 * 4.0 Задача
 *
 * int[] x = new int[28];
 * for (int i = 0; i < x.length; i++) {
 * x[i] = i * 635;
 * }
 *
 * Вывести на экран 0-й, 14-й и 27-й элементы массива.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int[] x = new int[28];
        for (int i = 0; i < x.length; i++) {
            x[i] = i * 635;
        }

        System.out.println(x[0]);
        System.out.println(x[14]);
        System.out.println(x[27]);
    }
}
