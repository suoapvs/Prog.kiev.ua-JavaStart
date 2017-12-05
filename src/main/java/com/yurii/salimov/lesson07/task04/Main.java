package com.yurii.salimov.lesson07.task04;

/**
 * 7.4 Задача
 *
 * Дано текст. Убрать лишние пробелы, расставить знаки
 * препинания. Пример: «Я длинное предложение Я
 * второе предложение.» -> «Я длинное предложение. Я
 * второе предложение.»
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final String line = "Я длинное предложение Я второе предложение.";
        final String correctLine = correct(line);
        System.out.println(line);
        System.out.println(correctLine);
    }

    private static String correct(final String line) {
        final StringBuilder builder = new StringBuilder();
        final String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                builder.append(words[i]);
                if ((i + 1 < words.length) &&
                        (words[i + 1].length() > 0) &&
                        Character.isUpperCase(words[i + 1].charAt(0)) &&
                        (!words[i].endsWith("."))) {
                    builder.append(". ");
                } else {
                    builder.append(" ");
                }
            }
        }
        return builder.toString();
    }
}
