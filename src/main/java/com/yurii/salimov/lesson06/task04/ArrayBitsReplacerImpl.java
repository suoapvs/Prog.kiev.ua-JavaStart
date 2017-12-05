package com.yurii.salimov.lesson06.task04;

public final class ArrayBitsReplacerImpl implements ArrayBitsReplacer {

    private final int[] array;

    public ArrayBitsReplacerImpl(final int[] array) {
        this.array = array;
    }


    @Override
    public void setBit(final int position) {
        final int intPosition = getIntPosition(position);
        final int bitPosition = getBitPosition(position);
        this.array[intPosition] = setBit(this.array[intPosition], bitPosition);
    }

    @Override
    public boolean isBitSet(final int position) {
        final int intPosition = getIntPosition(position);
        final int bitPosition = getBitPosition(position);
        return isBitSet(this.array[intPosition], bitPosition);
    }

    private int setBit(final int x, final int position) {
        return x | (1 << position);
    }

    private boolean isBitSet(final int x, final int position) {
        return (x & (1 << position)) != 0;
    }

    private int getIntPosition(final int position) {
        return this.array.length - (position / 32) - 1;
    }

    private int getBitPosition(final int position) {
        return position % 32;
    }
}
