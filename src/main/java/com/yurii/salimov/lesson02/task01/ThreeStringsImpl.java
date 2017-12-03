package com.yurii.salimov.lesson02.task01;

import java.util.Scanner;

public final class ThreeStringsImpl implements ThreeStrings {

    private final Scanner scanner;
    private String firstString;
    private String secondString;
    private String thirdString;

    public ThreeStringsImpl() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void readFirst() {
        this.firstString = readString();
    }

    @Override
    public void readSecond() {
        this.secondString = readString();
    }

    @Override
    public void readThird() {
        this.thirdString = readString();
    }

    @Override
    public void printFirstAndThird() {
        printString(this.firstString + this.thirdString);
    }

    @Override
    public void printThirdSecondAndFirst() {
        printString(this.thirdString + this.secondString + this.firstString);
    }

    @Override
    public void printFirstSecondAndThird() {
        printString(this.firstString + this.secondString + this.thirdString);
    }

    private String readString() {
        return this.scanner.nextLine();
    }

    private void printString(final String string) {
        System.out.println(string);
    }
}
