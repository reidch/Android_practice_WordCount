package com.example.carolinereid.wordcount;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by carolinereid on 06/11/2017.
 */

public class WordsTest {

    Words words;

    @Before
    public void before(){
        words = new Words();
    }

    @Test
    public void canCountWords(){
        assertEquals(10, words.countWords("The Metaverse was built with plenty of room to expand."));
    }
}
