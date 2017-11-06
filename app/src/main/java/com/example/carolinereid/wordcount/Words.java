package com.example.carolinereid.wordcount;

import java.util.ArrayList;

/**
 * Created by carolinereid on 06/11/2017.
 */

public class Words {

    private ArrayList<String> words;

    public Words(){
        words = new ArrayList<>();
    }

    public void add(String word) {words.add(word);}

    public void resetWordsToCount(){
        this.words.clear();
    }

    public int countWords(String text) {
        resetWordsToCount();
        for (String word : text.split(" ")) {
            this.words.add(word);
        }
        return this.words.size();
    }
}
