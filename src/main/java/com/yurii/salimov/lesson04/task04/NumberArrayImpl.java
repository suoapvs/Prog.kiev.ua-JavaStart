package com.yurii.salimov.lesson04.task04;

import java.util.Random;

public final class NumberArrayImpl implements NumberArray {

    private final int[] numbers;

    public NumberArrayImpl(final int length) {
        this.numbers = new int[length];
    }

    @Override
    public void createRandom() {
        final Random random = new Random();
        for (int i = 0; i < this.numbers.length; i++) {
            this.numbers[i] = random.nextInt();
        }
    }

    @Override
    public int sum(int from, int to) {
        int sum = 0;
        for (int i = from; i < to; i++) {
            sum += this.numbers[i];
        }
        return sum;
    }

    @Override
    public int[] get() {
        return this.numbers;
    }
}
