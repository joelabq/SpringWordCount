package com.example.SpringWordCount;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class WordCounter {

    private final WordCount wordCount;

    @Bean
    public WordCounter getWordCounter(WordCount config) {
        return new WordCounter(config);
    }

    public WordCounter(WordCount wordCount) {
        this.wordCount = wordCount;
    }

    Map<String, Integer> count(String inputWords){
        inputWords = inputWords.replace(",","");
        String[] keyVals = inputWords.split(" ");
        Map<String, Integer> words = new LinkedHashMap<String, Integer>();

        for (String keyVal : keyVals) {
            words.merge(keyVal, 1, Integer::sum);

        }

        return words;
    }
}
