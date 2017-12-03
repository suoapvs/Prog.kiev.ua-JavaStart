package com.yurii.salimov.lesson03.task01;

/**
 * 3.1 Задача
 *
 * 1. Задать массив целых чисел длинной 10 эл.
 * 2. Отсортировать числа в массиве
 * 3. Вывести на экран результат.
 * 4. Сделать возможность наполнения массива с клавиатуры*.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int arrayLength = 10;
        final NumberArray numberArray = new NumberArrayImpl(arrayLength);

        numberArray.read();
        numberArray.sort();
        numberArray.print();
    }
}
