package com.example.carolinereid.wordcount;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText textToQuery;
    private Button getWordCount;
    private TextView wordCount;
    private Words words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textToQuery = (EditText) findViewById(R.id.editText2);
        getWordCount = (Button) findViewById(R.id.button);
        wordCount = (TextView) findViewById(R.id.textView);
        words = new Words();
    }

    public void onGetWordCountButtonClicked(View button){
        String enterText = textToQuery.getText().toString();
        int count = words.countWords(enterText);

        wordCount.setText("Number of words: " + count);
    }
}
