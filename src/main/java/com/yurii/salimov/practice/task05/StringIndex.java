package com.yurii.salimov.practice.task05;

public final class StringIndex implements Index {

    private final String inputString;

    public StringIndex(final String inputString) {
        this.inputString = inputString;
    }

    @Override
    public int indexOf(final int ch) {
        return indexOf(ch, 0);
    }

    @Override
    public int indexOf(final String str) {
        return indexOf(str, 0);
    }

    @Override
    public int indexOf(final int ch, final int fromIndex) {
        int index = -1;
        final int length = this.inputString.length();
        if (fromIndex < length) {
            final int start = (fromIndex < 0) ? 0 : fromIndex;
            for (int i = start; i < length; i++) {
                if (this.inputString.charAt(i) == ch) {
                    index = i;
                }
            }
        }
        return index;
    }

    @Override
    public int indexOf(final String str, final int fromIndex) {
        return this.inputString.indexOf(str, fromIndex);
    }
}
