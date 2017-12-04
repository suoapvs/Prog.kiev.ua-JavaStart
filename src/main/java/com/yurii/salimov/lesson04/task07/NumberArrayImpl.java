package com.yurii.salimov.lesson04.task07;

public final class NumberArrayImpl implements NumberArray {

    private final int[] numbers;

    public NumberArrayImpl(final int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public int maxRepetition() {
        int index = 0;
        int currentCount;
        int previousCount = 0;
        for (int i = 0; i < this.numbers.length; i++) {
            currentCount = 0;
            for (int number : this.numbers) {
                if (number == this.numbers[i]) {
                    currentCount++;
                }
            }
            if (currentCount > previousCount) {
                previousCount = currentCount;
                index = i;
            }
        }
        return this.numbers[index];
    }

    @Override
    public int[] get() {
        return this.numbers;
    }
}
