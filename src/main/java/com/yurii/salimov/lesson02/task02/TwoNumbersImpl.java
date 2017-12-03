package com.yurii.salimov.lesson02.task02;

import java.util.Scanner;

public final class TwoNumbersImpl implements TwoNumbers {

    private final Scanner scanner;
    private int firstNumber;
    private int secondNumber;

    public TwoNumbersImpl() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void readFirstNumber() {
        this.firstNumber = readNumber();
    }

    @Override
    public void readSecondNumber() {
        this.secondNumber = readNumber();
    }

    @Override
    public void printSum() {
        final int sum = this.firstNumber + this.secondNumber;
        printNumber(sum);
    }

    @Override
    public void printSubtraction() {
        final int subtraction = this.firstNumber - this.secondNumber;
        printNumber(subtraction);
    }

    @Override
    public void printMultiplication() {
        final int multiplication = this.firstNumber * this.secondNumber;
        printNumber(multiplication);
    }

    @Override
    public void printDivision() {
        final int division = this.firstNumber / this.secondNumber;
        printNumber(division);
    }

    private int readNumber() {
        return this.scanner.nextInt();
    }

    private void printNumber(final int number) {
        System.out.println(number);
    }
}
