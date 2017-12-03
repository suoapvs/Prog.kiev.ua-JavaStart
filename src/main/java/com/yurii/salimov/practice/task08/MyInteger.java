package com.yurii.salimov.practice.task08;

public final class MyInteger {

    public static int parseInt(final String s) throws NumberFormatException {
        return parseInt(s, 10);
    }

    public static int parseInt(String s, int radix) throws NumberFormatException {
        if (s == null) {
            throw new NumberFormatException("null");
        }
        if (radix < Character.MIN_RADIX) {
            throw new NumberFormatException(
                    "radix " + radix + " less than Character.MIN_RADIX"
            );
        }
        if (radix > Character.MAX_RADIX) {
            throw new NumberFormatException(
                    "radix " + radix + " greater than Character.MAX_RADIX"
            );
        }
        int result = 0;
        boolean negative = false;
        int i = 0;
        final int len = s.length();
        int limit = -Integer.MAX_VALUE;
        if (len > 0) {
            char firstChar = s.charAt(0);
            if (firstChar < '0') {
                if (firstChar == '-') {
                    negative = true;
                    limit = Integer.MIN_VALUE;
                } else if (firstChar != '+') {
                    throw new NumberFormatException(s);
                }
                if (len == 1) {
                    throw new NumberFormatException(s);
                }
                i++;
            }
            final int multmin = limit / radix;
            while (i < len) {
                final int digit = Character.digit(s.charAt(i++), radix);
                if (digit < 0) {
                    throw new NumberFormatException(s);
                }
                if (result < multmin) {
                    throw new NumberFormatException(s);
                }
                result *= radix;
                if (result < limit + digit) {
                    throw new NumberFormatException(s);
                }
                result -= digit;
            }
        } else {
            throw new NumberFormatException(s);
        }
        return negative ? result : -result;
    }
}
