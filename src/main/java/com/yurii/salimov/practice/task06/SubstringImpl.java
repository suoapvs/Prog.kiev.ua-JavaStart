package com.yurii.salimov.practice.task06;

public final class SubstringImpl implements Substring {

    private final String str;

    public SubstringImpl(final String str) {
        this.str = str;
    }

    @Override
    public String substring(final int beginIndex) {
        return substring(beginIndex, this.str.length());
    }

    @Override
    public String substring(int beginIndex, int endIndex) {
        if (beginIndex < 0 || beginIndex > endIndex || endIndex > this.str.length()) {
            throw new StringIndexOutOfBoundsException(beginIndex);
        }
        final String substring;
        if (beginIndex == 0 && endIndex == this.str.length()) {
            substring = this.str;
        } else {
            final StringBuilder sb = new StringBuilder();
            for (int i = beginIndex; i < this.str.length(); i++) {
                sb.append(this.str.charAt(i));
            }
            substring = sb.toString();
        }
        return substring;
    }
}
