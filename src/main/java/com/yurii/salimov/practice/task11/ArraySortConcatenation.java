package com.yurii.salimov.practice.task11;

import java.util.Arrays;

public final class ArraySortConcatenation implements SortConcatenation {

    private final int[] first;
    private final int[] second;

    public ArraySortConcatenation(final int[] first, final int[] second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int[] sortConcat() {
        final int[] concatArray = concat(this.first, this.second);
        return sort(concatArray);
    }

    private static int[] concat(final int[] first, final int[] second) {
        final int[] concatArray = new int[first.length + second.length];
        System.arraycopy(first, 0, concatArray, 0, first.length);
        System.arraycopy(second, 0, concatArray, first.length, second.length);
        return concatArray;
    }

    private static int[] sort(final int[] array) {
        Arrays.sort(array);
        return array;
    }
}
