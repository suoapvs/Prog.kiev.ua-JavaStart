package com.yurii.salimov.lesson04.task10;

public final class NumberArrayImpl implements NumberArray {

    private final int[] numbers;

    public NumberArrayImpl(final int length) {
        this.numbers = new int[length];
    }

    @Override
    public int[] symmetricArray() {
        final int length = this.numbers.length;
        int count = (length % 2 == 0) ? 1 : 0;
        for (int i = length / 2; i < length; i++) {
            this.numbers[i] = this.numbers[length - i - 1] = count++;
        }
        return this.numbers;
    }
}
