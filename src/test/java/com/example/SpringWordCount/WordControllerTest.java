package com.example.SpringWordCount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

//@SpringBootTest
@WebMvcTest
@AutoConfigureMockMvc
public class WordControllerTest {

//    @Autowired
//    WordCount config;
//    private final WordCounter wordCounter = new WordCounter(config);

    @MockBean
    WordCount config;
    @MockBean
    WordCounter wordCounter;

    @BeforeEach
    public void init(){
        LinkedHashMap<String, Integer> retVal = new LinkedHashMap<>();
        retVal.put("how",1);
        retVal.put("now",1);
        retVal.put("brown",1);
        retVal.put("cow",1);

        when(wordCounter.count("how now, brown cow")).thenReturn(retVal);

    }

    @Test
    public void countWordsController() throws Exception {
        Map<String,Integer> count = wordCounter.count("how now, brown cow");

        assertEquals(count.get("how"),1, "word count for 'how' is now equal to 1");

    }

}
