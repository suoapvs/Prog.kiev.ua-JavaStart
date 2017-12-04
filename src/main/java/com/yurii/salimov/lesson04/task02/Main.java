package com.yurii.salimov.lesson04.task02;

/**
 * 4.2 Задача
 *
 * Вывести на экран все числа от 1 до 100, которые
 * делятся на 3 без остатка.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
//---------------------------------------------
        for (int i = 3; i <= 100; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
