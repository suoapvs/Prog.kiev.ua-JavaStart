package com.yurii.salimov.lesson03.task02;

/**
 * 3.2 Задача
 *
 * 1. Задать массив целых чисел длинной N эл.
 * 2. Поменять 1-й и последний элемент местами.
 * 3. Вывести массив на экран.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int arrayLength = 10;
        final NumberArray numberArray = new NumberArrayImpl(arrayLength);

        numberArray.read();
        numberArray.swapFirstAndLast();
        numberArray.print();
    }
}
