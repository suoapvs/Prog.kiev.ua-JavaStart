package com.yurii.salimov.lesson04.task04;

/**
 * 4.4 Задача
 *
 * Дано массив из 10 целых чисел. Вывести на экран
 * сумму всех его элементов кроме первого и
 * последнего.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int length = 10;
        final NumberArray numberArray = new NumberArrayImpl(length);
        numberArray.createRandom();
        final int sum = numberArray.sum(0, length);
        System.out.println(sum);
    }
}
