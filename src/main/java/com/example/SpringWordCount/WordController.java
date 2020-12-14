package com.example.SpringWordCount;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController

public class WordController {

//    @Autowired
//    WordCount config;
    @Autowired
    WordCounter wordCounter;

    //private final WordCounter wordCounter = new WordCounter(config);

    @PostMapping("/words/count")
    public Map<String, Integer> wordCounter(@RequestBody String words) throws JsonProcessingException {

       return wordCounter.count(words);

    }
}
