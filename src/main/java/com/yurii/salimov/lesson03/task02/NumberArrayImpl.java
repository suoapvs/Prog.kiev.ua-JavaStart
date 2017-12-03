package com.yurii.salimov.lesson03.task02;

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
    public void swapFirstAndLast() {
        final int firstIndex = this.numbers[0];
        final int lastIndex = this.numbers.length - 1;
        swap(firstIndex, lastIndex);
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

    private void swap(final int firstIndex, final int secondIndex) {
        final int temp = this.numbers[firstIndex];
        this.numbers[firstIndex] = this.numbers[secondIndex];
        this.numbers[secondIndex] = temp;
    }
}
