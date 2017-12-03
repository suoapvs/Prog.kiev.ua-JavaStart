package com.yurii.salimov.practice.task09;

import java.util.Arrays;

public final class MultiplicationTable {

    private final static int SIZE = 10;

    private final int[][] table;

    public MultiplicationTable() {
        this.table = new int[SIZE][SIZE];
    }

    public int[][] create() {
        for (int i = 1; i <= SIZE; i++) {
            for (int j = 1; j <= SIZE; j++) {
                this.table[i - 1][j - 1] = i * j;
            }
        }
        return this.table;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        final int[][] table = create();
        for (int[] line : table) {
            for (int value : line) {
                sb.append(value).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
