package com.yurii.salimov.lesson06.task02;

public final class ArraysEqualsImpl implements ArraysEquals {

    @Override
    public boolean equals(short[] first, short[] second) {
        if (first == second) {
            return true;
        }
        if (first.length != second.length) {
            return false;
        }
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }
        return true;
    }
}