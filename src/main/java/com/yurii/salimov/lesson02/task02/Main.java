package com.yurii.salimov.lesson02.task02;

/**
 * 2.2 Задача
 *
 * 1. Прочитать с консоли число 1.
 * 2. Прочитать с консоли число 2.
 * 3. Вывести результат.
 * 4. И так для каждого оператора.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final TwoNumbers worker = new TwoNumbersImpl();

        worker.readFirstNumber();
        worker.readSecondNumber();

        worker.printSum();
        worker.printSubtraction();
        worker.printMultiplication();
        worker.printDivision();
    }
}
