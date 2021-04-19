package com.helga.femalelogic;

/**
 * Created by Helga on 19.04.2020
 */

public class Statement {
    private int idQuest;
    private int[] idAnswers;
    private String question;
    private String[] answers;


    public Statement(int idQuest, String question, String[] answers, int[] idAnswers) {
        this.question = question;
        this.answers = answers;
        this.idQuest = idQuest;
        this.idAnswers = idAnswers;
    }

    public int getId() {
        return idQuest;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public int[] getIdAns() {
        return idAnswers;
    }


}
