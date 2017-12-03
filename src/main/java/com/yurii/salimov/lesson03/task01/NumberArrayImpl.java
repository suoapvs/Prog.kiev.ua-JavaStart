package com.yurii.salimov.lesson03.task01;

import java.util.Arrays;
import java.util.Scanner;

public final class NumberArrayImpl implements NumberArray {

    private final Scanner scanner;
    private final int[] numbers;

    public NumberArrayImpl(final int arrayLength) {
        this.numbers = new int[arrayLength];
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void read() {
        for (int i = 0; i < this.numbers.length; i++) {
            this.numbers[i] = readNumber();
        }
    }

    @Override
    public void sort() {
        Arrays.sort(this.numbers);
    }

    @Override
    public void print() {
        System.out.println(Arrays.toString(this.numbers));
    }

    @Override
    public int[] get() {
        return this.numbers;
    }

    private int readNumber() {
        return this.scanner.nextInt();
    }
}
