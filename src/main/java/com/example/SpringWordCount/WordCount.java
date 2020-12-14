package com.example.SpringWordCount;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("wordcount")
public class WordCount {
    private boolean caseSensitive;
    private Words words;

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
