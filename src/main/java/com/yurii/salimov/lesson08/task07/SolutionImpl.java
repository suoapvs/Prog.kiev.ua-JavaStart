package com.yurii.salimov.lesson08.task07;

public final class SolutionImpl implements Solution {

    private final double realPart;

    private final double imaginaryPart;

    public SolutionImpl(final double realPart) {
        this(realPart, 0);
    }

    public SolutionImpl(final double realPart, final double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public double real() {
        return this.realPart;
    }

    @Override
    public double imaginary() {
        return this.imaginaryPart;
    }

    @Override
    public String toString() {
        final String toString;
        if (this.imaginaryPart != 0) {
            if (this.imaginaryPart > 0) {
                toString = this.realPart + " + i * " + this.imaginaryPart;
            } else {
                toString = this.realPart + " - i * " + (-1 * this.imaginaryPart);
            }
        } else {
            toString = Double.toString(this.realPart);
        }
        return toString;
    }
}
