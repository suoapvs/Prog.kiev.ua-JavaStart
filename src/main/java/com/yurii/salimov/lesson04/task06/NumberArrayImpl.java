package com.yurii.salimov.lesson04.task06;

public final class NumberArrayImpl implements NumberArray {

    private final int[] numbers;

    public NumberArrayImpl(final int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public int max() {
        int max = this.numbers[0];
        for (int number : this.numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    @Override
    public int min() {
        int min = this.numbers[0];
        for (int number : this.numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    @Override
    public int[] get() {
        return this.numbers;
    }
}
