package com.yurii.salimov.lesson04.task01;

/**
 * 4.1 Задача
 *
 * Вывести на экран числа от 10 до 20 с помощью
 * всех известных циклов.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int fromIndex = 10;
        final int toIndex = 20;
        final NumberCycles numberCycles = new NumberCyclesImpl(fromIndex, toIndex);

        numberCycles.forNumber();
        numberCycles.whileNumber();
        numberCycles.doWhileNumber();
    }
}
