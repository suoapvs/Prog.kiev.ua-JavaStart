package com.yurii.salimov.lesson04.task08;

/**
 * 4.8 Задача
 *
 * С помощью консоли пользователь вводит
 * математическое выражение типа “1+33-4*7”. Написать
 * программу для подсчета его значения. Приоритет
 * операций не учитывается.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final Calculator calculator = new CalculatorImpl();
        calculator.run();
    }
}
