package com.yurii.salimov.practice.task03;

import com.yurii.salimov.practice.task02.Function;
import com.yurii.salimov.practice.task02.FunctionTable;
import com.yurii.salimov.practice.task02.MyFunction;
import com.yurii.salimov.practice.task02.Table;

/**
 * P.3 Задача
 *
 * Найти в предложении самое короткое и самое длинное слово.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final String line = "Найти в предложении самое короткое и самое длинное слово.";
        final Maths<String> maths = new Words(line);
        System.out.printf(maths.min() + " - " + maths.max());
    }
}
