package com.example.SpringWordCount;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@TestPropertySource(properties = {
        "wordcount.casesensitive=false",
        "wordcount.words.skip[0]=notThe",
        "wordcount.words.skip[1]=an",
        "wordcount.words.skip[2]=a",
})

public class WordCountTest {

    @Autowired private WordCount config;

    @Test
    public void testConfig(){
        assertEquals(config.getWords().getSkip().get(0),"notThe", "Config does not match");
    }
}
