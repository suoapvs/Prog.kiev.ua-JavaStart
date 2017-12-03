package com.yurii.salimov.practice.task03;

public final class Words implements Maths<String> {

    private final String line;

    public Words(final String line) {
        this.line = line;
    }

    @Override
    public String max() {
        final String[] words = this.line.split(" ");
        int indexMax = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > words[indexMax].length()) {
                indexMax = i;
            }
        }
        return words[indexMax];
    }

    @Override
    public String min() {
        final String[] words = this.line.split(" ");
        int indexMin = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < words[indexMin].length()) {
                indexMin = i;
            }
        }
        return words[indexMin];
    }
}