package com.yurii.salimov.lesson08.task04;

/**
 * 8.4 Задача
 *
 * Вывести на экран сумму цифр заданного числа.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        printEnglishAlphabet();
    }

    private static void printEnglishAlphabet() {
        final int number = 12345;
        final int sum = sum(number);
        System.out.println(number + " - " + sum);
    }

    private static int sum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
