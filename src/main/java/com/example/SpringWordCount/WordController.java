package com.example.SpringWordCount;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController

public class WordController {

    private final WordCounter wordCounter = new WordCounter();

    @PostMapping("/words/count")
    public Map<String, Integer> wordCounter(@RequestBody String words) throws JsonProcessingException {

       return wordCounter.count(words);

    }
}
