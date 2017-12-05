package com.yurii.salimov.lesson06.task01;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

/**
 * 6.1 Задача
 *
 * Ввести с консоли дату. Сравнить ее с текущей датой в
 * системе. Вывести отличающиеся части (год, месяц) на
 * экран.
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        try {
            final DateReader dateReader = new DateReaderImpl();
            final Date userDate = dateReader.read();
            final Date systemDate = new Date();
            final DifferentDate differentDate = new DifferentDateImpl(userDate, systemDate);
            differentDate.printDifferent();
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
}
