package com.yurii.salimov.lesson02.task01;

/**
 * 2.1 Задача
 *
 * 1. Прочитать строку 1.
 * 2. Прочитать строку 2.
 * 3. Прочитать строку 3.
 * 4. Вывести на экран:
 *  1) S1 + S3
 *  2) S3 + S2 + S1
 *  3) S1 + S2 + S3
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final ThreeStrings worker = new ThreeStringsImpl();

        worker.readFirst();
        worker.readSecond();
        worker.readThird();

        worker.printFirstAndThird();
        worker.printThirdSecondAndFirst();
        worker.printFirstSecondAndThird();
    }
}
