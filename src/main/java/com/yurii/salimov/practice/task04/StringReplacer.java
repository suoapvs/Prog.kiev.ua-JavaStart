package com.yurii.salimov.practice.task04;

public final class StringReplacer implements Replacer<String> {

    private final String inputString;

    public StringReplacer(final String inputString) {
        this.inputString = inputString;
    }

    @Override
    public String replace(final String regex, final String replacement) {
        final String[] words = this.inputString.split(" ");
        final StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.equals(regex)) {
                sb.append(replacement);
            } else {
                sb.append(word);
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
