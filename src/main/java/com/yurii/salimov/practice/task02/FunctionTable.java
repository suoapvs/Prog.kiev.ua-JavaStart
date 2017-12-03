package com.yurii.salimov.practice.task02;

import java.util.Map;
import java.util.TreeMap;

public final class FunctionTable implements Table<Double, Double> {

    private final Function function;
    private double from;
    private double to;
    private double step;

    public FunctionTable(final Function function) {
        this.function = function;
    }

    public FunctionTable(
            final Function function,
            final double from,
            final double to,
            final double step
    ) {
        this(function);
        this.from = from;
        this.to = to;
        this.step = step;
    }

    @Override
    public Map<Double, Double> create() {
        final Map<Double, Double> table = new TreeMap<>();
        double result;
        for (double x = this.from; x <= this.to; x +=  this.step) {
            result = this.function.get(x);
            table.put(x, result);
        }
        return table;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        final Map<Double, Double> table = create();
        for (Map.Entry<Double, Double> entry: table.entrySet()) {
            sb.append(entry.getKey()).append("\t\t").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }

    public void setFrom(final double from) {
        this.from = from;
    }

    public void setTo(final double to) {
        this.to = to;
    }

    public void setStep(final double step) {
        this.step = step;
    }
}
