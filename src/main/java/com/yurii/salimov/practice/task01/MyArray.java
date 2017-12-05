package com.yurii.salimov.practice.task01;

import java.util.Arrays;

public final class MyArray implements UniqueArray {

    private final int[] array;

    public MyArray(final int[] array) {
        this.array = array;
    }

    @Override
    public int[] unique() {
        final int[] uniqueArray = new int[this.array.length];
        int index = 0;
        for (int number : this.array) {
            if (isUnique(number)) {
                uniqueArray[index++] = number;
            }
        }
        return Arrays.copyOf(uniqueArray, index);
    }

    private boolean isUnique(final int number) {
        int count = 0;
        for (int second : this.array) {
            if (number == second) {
                count++;
                if (count > 1) {
                    break;
                }
            }
        }
        return (count == 1);
    }
}
