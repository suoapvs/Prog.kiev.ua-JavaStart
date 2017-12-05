package com.yurii.salimov.lesson08.task03;

public final class TranslatorImpl implements Translator {

    private String[] eng;

    private String[] rus;

    public TranslatorImpl(final String dictionary) {
        splitDictionaries(dictionary);
    }

    @Override
    public String translate(String line) {
        final String[] words = line.split(" ");
        final StringBuilder sb = new StringBuilder();
        for (String word : words) {
            for (int i = 0; i < this.eng.length; i++) {
                if (this.eng[i].equals(word)) {
                    sb.append(this.rus[i]).append(" ");
                }
            }
        }
        return sb.toString();
    }

    private void splitDictionaries(final String dictionary) {
        final String[] pairs = dictionary.split(";");
        this.eng = new String[pairs.length];
        this.rus = new String[pairs.length];
        for (int i = 0; i < pairs.length; i++) {
            final String[] pair = pairs[i].trim().split("=");
            this.eng[i] = pair[0];
            this.rus[i] = pair[1];
        }
    }
}
