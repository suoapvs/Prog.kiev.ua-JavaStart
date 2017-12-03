package com.yurii.salimov.lesson03.task03;

/**
 * 3.3 Задача
 *
 * 1. Ввести с клавиатуры массив из 10 чисел.
 * 2. Разбить его на 2 массива равной длинны.
 * 3. Отсортировать каждую из половинок и вывести их содержимое на экран.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int arrayLength = 10;
        final NumberArray numberArray = new NumberArrayImpl(arrayLength);

        numberArray.read();
        numberArray.split();
        numberArray.sortFirstPart();
        numberArray.sortLastPart();
        numberArray.print();
        numberArray.printFirstPart();
        numberArray.printLastPart();
    }
}
