package com.yurii.salimov.lesson04.task10;

import java.util.Arrays;

/**
 * 4.10 Задача
 *
 * Написать метод, который заполнит массив
 * произвольного размера числами по возрастанию,
 * начиная с центра массива, например,
 * [5,4,3,2,1,0,1,2,3,4,5].
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int length = 11;
        final NumberArray numberArray = new NumberArrayImpl(length);
        final int[] array = numberArray.symmetricArray();
        System.out.println(Arrays.toString(array));
    }
}
