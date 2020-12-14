package com.example.SpringWordCount;


import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties("WordCount")
public class WordCount {
    private boolean caseSensitive;
    private Words words;

    public WordCount(boolean caseSensitive, Words words) {
        this.caseSensitive = caseSensitive;
        this.words = words;
    }

    public boolean isCaseSensitive() {
        return caseSensitive;
    }

    public WordCount setCaseSensitive(boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }

    public Words getWords() {
        return words;
    }

    public WordCount setWords(Words words) {
        this.words = words;
        return this;
    }

    public static class Words{
        private List<String> skip;

        public List<String> getSkip() {
            return skip;
        }

        public Words setSkip(List<String> skip) {
            this.skip = skip;
            return this;
        }
    }


}
