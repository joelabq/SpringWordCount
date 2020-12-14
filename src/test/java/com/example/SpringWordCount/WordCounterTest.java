package com.example.SpringWordCount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCounterTest {

    @Test
    public void countWords(){
        WordCounter wordcounter = new WordCounter();
        assertEquals("{\"A\": 1,\"brown\": 2,\"cow\": 1,\"jumps\": 1,\"over\": 1,\"a\": 1,\"fox\": 1}",
                wordcounter.count("A brown cow jumps over a brown fox"),
                "Did not return correct words or count");
    }
}
