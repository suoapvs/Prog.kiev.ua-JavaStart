package com.yurii.salimov.practice.task10;

public final class ShortConcatenation implements Concatenation {

    @Override
    public int concat(short first, short second) {
        return ((first << 16) | second);
    }
}
