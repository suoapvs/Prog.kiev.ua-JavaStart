package com.yurii.salimov.practice.task02;

public final class MyFunction implements Function {

    @Override
    public double get(double x) {
        return x * Math.pow(1 + 2 / (x + 7), x / 10);
    }

    @Override
    public String toString() {
        return "f(x) = x * Math.pow(1 + 2 / (x + 7), x / 10)";
    }
}
