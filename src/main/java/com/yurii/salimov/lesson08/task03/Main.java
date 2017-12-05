package com.yurii.salimov.lesson08.task03;

/**
 * 8.3 Задача
 *
 * Дан словарь в виде «англ. слово=русское слово, англ.
 * слово=русское слово,…». Написать программу переводчик
 * на основе словаря.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        printEnglishAlphabet();
    }

    private static void printEnglishAlphabet() {
        final String dictionary = "Hello=Привет; World=Мир";
        final String line = "Hello World";
        final Translator translator = new TranslatorImpl(dictionary);
        final String translatedLine = translator.translate(line);
        System.out.println(line);
        System.out.println(translatedLine);
    }
}
