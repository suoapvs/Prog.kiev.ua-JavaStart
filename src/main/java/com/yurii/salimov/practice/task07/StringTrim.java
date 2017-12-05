package com.yurii.salimov.practice.task07;

public final class StringTrim implements Trim {

    private final String str;

    public StringTrim(final String str) {
        this.str = str;
    }

    @Override
    public String trim() {
        final String trimLeftStr = trimLeft();
        final Trim rightTrim = new StringTrim(trimLeftStr);
        return rightTrim.trimRight();
    }

    @Override
    public String trimLeft() {
        final StringBuilder sb = new StringBuilder();
        while (sb.length() > 0 && sb.charAt(0) == ' ') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    @Override
    public String trimRight() {
        final StringBuilder sb = new StringBuilder(this.str);
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
