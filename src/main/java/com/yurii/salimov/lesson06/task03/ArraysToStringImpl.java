package com.yurii.salimov.lesson06.task03;

public final class ArraysToStringImpl implements ArraysToString {

    @Override
    public String toString(final int[] array) {
        final StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if (i < array.length - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
