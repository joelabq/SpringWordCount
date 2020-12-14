package com.example.SpringWordCount;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@EnableConfigurationProperties
@SpringBootTest
public class WordCounterTest {

    @Autowired
    WordCount config;

    @Test
//    public void countWords(){
//        WordCounter wordcounter = new WordCounter(config);
//        assertEquals("{A=1, brown=2, cow=1, jumps=1, over=1, a=1, fox=1}",
//                wordcounter.count("A brown cow jumps over a brown fox").toString(),
//                "Did not return correct words or count");
//    }

    public void countWords(){
        WordCounter wordcounter = new WordCounter(config);
        assertEquals("{brown=2, cow=1, jumps=1, over=1, fox=1}",
                wordcounter.count("A brown cow, jumps over a brown fox").toString(),
                "Did not return correct words or count");
    }
}
