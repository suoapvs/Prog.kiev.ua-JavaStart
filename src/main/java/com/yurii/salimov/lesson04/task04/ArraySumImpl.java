package com.yurii.salimov.lesson04.task04;

public final class ArraySumImpl implements ArraySum {

    private final int[] numbers;

    public ArraySumImpl(final int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public int sum(int from, int to) {
        int sum = 0;
        for (int i = from; i < to; i++) {
            sum += this.numbers[i];
        }
        return sum;
    }
}
