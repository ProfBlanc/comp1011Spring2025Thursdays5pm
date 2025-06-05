package com.example.comp1011spring2025thursdays5pm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question {

    private String text;
    private List<QuestionOption> options = new ArrayList<QuestionOption>();
    private int correctAnswer;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<QuestionOption> getOptions() {
        return options;
    }
        //setOption("hi", "bye", "dry")
    //setOption("one")
    //setOption("one", "two")
    public void setOptions(QuestionOption ...options) {
        this.options.clear();
        this.options = Arrays.asList(options);
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        if(correctAnswer < 0 || correctAnswer >= options.size())
            throw new IllegalArgumentException("Invalid correct answer");

        this.correctAnswer = correctAnswer;
    }

    public Question(String text, QuestionOption ...options) {
        setText(text);
        setOptions(options);
    }
}
