package com.yurii.salimov.lesson06.task06;

import com.yurii.salimov.lesson06.task03.ArraysToString;
import com.yurii.salimov.lesson06.task03.ArraysToStringImpl;

import java.util.Random;
import java.util.Scanner;

/**
 * 6.6 Задача
 *
 * Ввести с консоли целое число. Посчитать количество
 * единиц в его бинарном представлении (“1011” –> 3).
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final int number = readNumber();

        final int count = oneCount(number);
        System.out.println(count);
    }

    private static int oneCount(int number) {
        int count = 0;
        while (number > 0) {
            if (number % 2 != 0) {
                count++;
            }
            number /= 2;
        }
        return count;
    }

    private static int readNumber() {
        final Scanner scanner = new Scanner(System.in);
        final int number = scanner.nextInt();
        scanner.close();
        return number;
    }
}
