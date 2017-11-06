package com.example.carolinereid.wordcount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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

    public static void main(String[] args) {
        HashMap<String, Integer> words = new HashMap<String, Integer>();

        words.put("it", 6);
        words.put("was", 6);
        words.put("the", 6);
        words.put("best", 1);
        words.put("of", 6);
        words.put("times", 2);
        words.put("worst", 1);
        words.put("age", 2);
        words.put("wisdom", 1);
        words.put("foolishness", 1);
        words.put("epoch", 2);
        words.put("belief", 1);
        words.put("incredulity", 1);

        Set set = words.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("the word " + mentry.getKey() + " occurs ");
            System.out.println(mentry.getValue() + " time(s) in the sentence");
        }
    }
}
