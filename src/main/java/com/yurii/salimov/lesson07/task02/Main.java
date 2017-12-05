package com.yurii.salimov.lesson07.task02;

/**
 * 7.2 Задача
 *
 * Дано текст и определенное слово. Посчитать сколько раз
 * заданное слово встречается в тексте.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final String line = "Дано текст и определенное слово " +
                "Посчитать сколько раз заданное слово встречается в тексте";
        final String word = "слово";
        final int count = count(line, word);
        System.out.println(count);
    }

    private static int count(final String line, final String actualWord) {
        final String[] words = line.split(" ");
        int count = 0;
        for (String word : words) {
            if (word.equalsIgnoreCase(actualWord)) {
                count++;
            }
        }
        return count;
    }
}
