package com.yurii.salimov.lesson04.task01;

public final class NumberCyclesImpl implements NumberCycles {

    private final int fromIndex;
    private final int toIndex;

    public NumberCyclesImpl(final int fromIndex, final int toIndex) {
        this.fromIndex = fromIndex;
        this.toIndex = toIndex;
    }

    @Override
    public void forNumber() {
        for (int i = this.fromIndex; i <= this.toIndex; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Override
    public void whileNumber() {
        int i = this.fromIndex;
        while (i <= this.toIndex) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    @Override
    public void doWhileNumber() {
        int i = this.fromIndex;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= this.toIndex);
        System.out.println();
    }
}
