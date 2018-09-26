package com.example.apavlidi.trueorflase;

/**
 * Created by nomad on 6/12/2015.
 */
public class Question {
    private String strQuestion;
    private boolean correctAnswer;
    private String correctAnswerStr;

    public Question() {

    }

    public Question(String strQuestion, boolean correctAnswer) {
        this.strQuestion = strQuestion;
        this.correctAnswer = correctAnswer;
    }

    public Question(String strQuestion, boolean correctAnswer,String correctAnswerStr) {
        this.strQuestion = strQuestion;
        this.correctAnswer = correctAnswer;
        this.correctAnswerStr=correctAnswerStr;
    }

    public void setCorrectAnswerStr(String correctAnswerStr) {this.correctAnswerStr = correctAnswerStr;}

    public String getCorrectAnswerStr() {return correctAnswerStr; }

    public String getStrQuestion() {
        return strQuestion;
    }

    public boolean getCorrectAnswer() {
        return correctAnswer;
    }

    public void setStrQuestion(String strQuestion) {
        this.strQuestion = strQuestion;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "strQuestion='" + strQuestion + '\'' +
                ", correctAnswer=" + correctAnswer +
                '}';
    }
}
