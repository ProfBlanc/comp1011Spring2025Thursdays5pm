package com.example.comp1011spring2025thursdays5pm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz {
    private List<Question> questions = new ArrayList<>();

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Question ...questions) {
        this.questions.clear();
        this.questions = Arrays.asList(questions);
    }
    public Quiz(Question ...questions){
        setQuestions(questions);
    }

    public static Quiz CreateSimpleQuiz(){

QuestionOption q1Op1 = new QuestionOption("Monday");
QuestionOption q1Op2 = new QuestionOption("Tuesday");
QuestionOption q1Op3 = new QuestionOption("Wednesday");
QuestionOption q1Op4 = new QuestionOption("Thursday");
Question q1 = new Question("What is the first day of the week?",
        q1Op1, q1Op2, q1Op3, q1Op4);

QuestionOption q2Op1 = new QuestionOption("June");
QuestionOption q2Op2 = new QuestionOption("February");
QuestionOption q2Op3 = new QuestionOption("March");
QuestionOption q2Op4 = new QuestionOption("January");
Question q2 = new Question("What is the first month of the year?",
        q2Op1, q2Op2, q2Op3, q2Op4);
q2.setCorrectAnswer(3);

QuestionOption q3Op1 = new QuestionOption("Vancouver");
QuestionOption q3Op2 = new QuestionOption("Montreal");
QuestionOption q3Op3 = new QuestionOption("Ottawa");
QuestionOption q3Op4 = new QuestionOption("Toronto");
Question q3 = new Question("What is the capital city of Canada?",
        q3Op1, q3Op2, q3Op3, q3Op4);
q3.setCorrectAnswer(2);

return new Quiz(q1, q2, q3);
    }

}
