package com.yurii.salimov.lesson03.task05;

import java.util.Scanner;

/**
 * 3.5 Задача
 *
 * Написать код для зеркального переворота массива (1,2,3,4) -> (4,3,2,1).
 * Написать программу, которая позволит задать длину массива с клавиатуры, наполнить его
 * элементами, а затем выводить нужный элемент по его индексу на консоль.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final NumberArray numberArray = new NumberArrayImpl();

        numberArray.read();
        numberArray.mirror();
        numberArray.print();
    }
}
