package com.yurii.salimov.lesson03.task05;

import java.util.Arrays;
import java.util.Scanner;

public final class NumberArrayImpl implements NumberArray {

    private final Scanner scanner;
    private int[] numbers;

    public NumberArrayImpl() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void read() {
        final int length = readNumber();
        this.numbers = new int[length];
        for (int i = 0; i < length; i++) {
            this.numbers[i] = readNumber();
        }
    }

    @Override
    public void mirror() {
        final int length = this.numbers.length;
        for (int i = 0; i < (length / 2); i++) {// наприимер a=3; b=4
            this.numbers[i] = this.numbers[i] + this.numbers[(length - 1) - i];// a=a+b; (a=7)
            this.numbers[(length - 1) - i] = this.numbers[i] - this.numbers[(length - 1) - i];// b=a-b; (b=3)
            this.numbers[i] = this.numbers[i] - this.numbers[(length - 1) - i];// a=a-b; (a=4)
        }
    }

    @Override
    public void print() {
        System.out.println(Arrays.toString(numbers));
    }

    @Override
    public void print(final int index) {
        System.out.println(this.numbers[index]);
    }

    @Override
    public int[] get() {
        return this.numbers;
    }

    private int readNumber() {
        return this.scanner.nextInt();
    }
}
