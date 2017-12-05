package com.yurii.salimov.lesson06.task01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public final class DateReaderImpl implements DateReader {

    private final static String DATE_FORMAT = "dd MM yyyy";

    private final Scanner scanner;

    public DateReaderImpl() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public Date read() throws ParseException {
        final String dateLine = readDate();
        return parse(dateLine);
    }

    private String readDate() {
        System.out.println("Enter your date use format " + DATE_FORMAT + ":");
        return this.scanner.nextLine();
    }

    private Date parse(final String line) throws ParseException {
        final SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        return dateFormat.parse(line);
    }
}
