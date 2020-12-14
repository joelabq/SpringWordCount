package com.example.SpringWordCount;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class WordCounter {

    @Bean
    public WordCounter WordCounter() {
        return new WordCounter();
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
