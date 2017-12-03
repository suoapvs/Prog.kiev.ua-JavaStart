package com.yurii.salimov.lesson03.task03;

import java.util.Arrays;
import java.util.Scanner;

public final class NumberArrayImpl implements NumberArray {

    private final Scanner scanner;
    private final int[] numbers;
    private int[] firstNumbers;
    private int[] lastNumbers;

    public NumberArrayImpl(final int arrayLength) {
        this.scanner = new Scanner(System.in);
        this.numbers = new int[arrayLength];
        this.firstNumbers = new int[arrayLength / 2];
        this.lastNumbers = new int[arrayLength - arrayLength / 2];
    }

    @Override
    public void read() {
        for (int i = 0; i < this.numbers.length; i++) {
            this.numbers[i] = readNumber();
        }
    }

    @Override
    public void split() {
        copyFirstPart();
        copyLastPart();
    }

    @Override
    public void sort() {
        sort(this.numbers);
    }

    @Override
    public void sortFirstPart() {
        sort(this.firstNumbers);
    }

    @Override
    public void sortLastPart() {
        sort(this.lastNumbers);
    }

    @Override
    public void print() {
        printNumbers(this.numbers);
    }

    @Override
    public void printFirstPart() {
        printNumbers(this.firstNumbers);
    }

    @Override
    public void printLastPart() {
        printNumbers(this.lastNumbers);
    }

    @Override
    public int[] get() {
        return this.numbers;
    }

    @Override
    public int[] getFirstPart() {
        return this.firstNumbers;
    }

    @Override
    public int[] getLastPart() {
        return this.lastNumbers;
    }

    private int readNumber() {
        return this.scanner.nextInt();
    }

    private void sort(final int[] numbers) {
        Arrays.sort(numbers);
    }

    private void printNumbers(final int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    private void copyFirstPart() {
        final int fromIndex = 0;
        final int toIndex = this.numbers.length / 2;
        this.firstNumbers = Arrays.copyOfRange(this.numbers, fromIndex, toIndex);
    }

    private void copyLastPart() {
        final int fromIndex = this.numbers.length / 2;
        final int toIndex = this.numbers.length;
        this.lastNumbers = Arrays.copyOfRange(this.numbers, fromIndex, toIndex);
    }
}
