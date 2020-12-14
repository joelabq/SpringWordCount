package com.example.SpringWordCount;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Locale;
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
        System.out.println("Get words: "+this.wordCount.isCaseSensitive());
        System.out.println(this.wordCount.getWords().getSkip().toString());

        if (!this.wordCount.isCaseSensitive()) inputWords = inputWords.toLowerCase(Locale.ROOT);
        for (String word : this.wordCount.getWords().getSkip()) {
            inputWords =  inputWords.replace(word,"");
        }

        inputWords = inputWords.replace(",","");
        inputWords = inputWords.replace("  "," ");
        inputWords = inputWords.trim();
        System.out.println("INPUT WORDS:"+inputWords+":END:");

        String[] keyVals = inputWords.split(" ");

        Map<String, Integer> words = new LinkedHashMap<String, Integer>();

        for (String keyVal : keyVals) {
            words.merge(keyVal, 1, Integer::sum);

        }

        return words;
    }
}
