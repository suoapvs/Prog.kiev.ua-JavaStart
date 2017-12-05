package com.yurii.salimov.lesson07.task01;

import com.yurii.salimov.lesson06.task01.DateReader;
import com.yurii.salimov.lesson06.task01.DateReaderImpl;
import com.yurii.salimov.lesson06.task01.DifferentDate;
import com.yurii.salimov.lesson06.task01.DifferentDateImpl;

import java.text.ParseException;
import java.util.Date;

/**
 * 7.1 Задача
 *
 * Дано текст из 3-х слов “word1 word2 word3”. Поменять 1-е
 * и 3-е слова местами и вывести на экран результат.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final String line = "word1 word2 word3";
        final String newLine = replaceFirstAndThird(line);
        System.out.println(newLine);
    }

    private static String replaceFirstAndThird(final String line) {
        final String[] words = line.split(" ");
        return (words[2] + " " + words[1] + " " + words[0]);
    }
}
