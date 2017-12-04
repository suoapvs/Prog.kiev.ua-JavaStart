package com.yurii.salimov.lesson04.task03;

public final class NumberArrayImpl implements NumberArray {

    private final int from;
    private final int to;

    public NumberArrayImpl(final int from, final int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public int[] create() {
        final int length = Math.abs(this.to - this.from);
        final int[] numbers = new int[length];
        final int step = (this.from < this.to) ? 1 : -1;
        int number = this.from;
        for (int i = 0; i < length; i++) {
            numbers[i] = number;
            number += step;
        }
        return numbers;
    }
}
