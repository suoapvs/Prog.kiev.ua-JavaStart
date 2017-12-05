package com.yurii.salimov.lesson06.task05;

import java.util.Scanner;

/**
 * 6.5 Задача
 *
 * Ввести с консоли число в бинарном формате. Перевести
 * его в int и вывести на экран (“10” -> 2).
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final String binaryNumber = readBinaryNumber();
        final int number = toInt(binaryNumber);
        System.out.println(binaryNumber + " -> " + number);
    }

    private static int toInt(final String binaryNumber) {
        int number = 0;
        final int length = binaryNumber.length();
        for (int i = 0; i < length; i++) {
            if (binaryNumber.charAt(length - i - 1) == '1') {
                number += Math.pow(2, i);
            }
        }
        return number;
    }

    private static String readBinaryNumber() {
        final Scanner scanner = new Scanner(System.in);
        final String binaryNumber = scanner.nextLine();
        scanner.close();
        return binaryNumber;
    }
}
