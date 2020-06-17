package com.veltro.kuiskevin;

public class Question {

    public String mQuestions[] = {
            "1+1",
            "1+2",
            "1+3",
            "1+4",
            "1+5",
            "1+6",
            "1+7",
            "1+8",
            "1+9"
    };

    private String mChoices[][] = {
            {"1","2","3","4"},
            {"2","3","4","5"},
            {"3","4","5","6"},
            {"4","5","6","7"},
            {"5","6","7","8"},
            {"6","7","8","9"},
            {"7","8","9","1"},
            {"8","9","1","2"},
            {"10","1","2","3"}
    };

    private String mCorrectAnswer[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a] [0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a] [1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a] [2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = mChoices[a] [3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }

}
