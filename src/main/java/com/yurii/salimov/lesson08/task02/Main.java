package com.yurii.salimov.lesson08.task02;

/**
 * 8.2 Задача
 *
 * Проверить баланс круглых скобок в выражении.
 * Пример: “((x – 8)+a(y – 1))”.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        printEnglishAlphabet();
    }

    private static void printEnglishAlphabet() {
        final String line = "((x – 8)+a(y – 1))";
        final boolean isCorrectLine = isCorrect(line);
        System.out.println(line + " - " + (isCorrectLine ? "correct" : "not correct"));
    }

    private static boolean isCorrect(final String line) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            final char ch = line.charAt(i);
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
            }
        }
        return (count == 0);
    }
}
