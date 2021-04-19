package com.helga.femalelogic;

import com.badlogic.gdx.utils.Array;

import java.util.Scanner;

/**
 * Created by Helga on 21.04.2020
 */
public class GameProcess {

    private Statement nowStat;
    public Scanner but;
    public Array<Statement> statements;

    public GameProcess() {
        statements = new Array<>();
        but = new Scanner(System.in);
    }

    public void createRoom1() {
        statements.clear();
        statements.add(new Statement(0, "Привет! Как дела?", new String[]{"Привет! Чудесно", "Привет! Нормально", "Привет! Сойдет"}, new int[]{1, 2, 3}));
        statements.add(new Statement(1, "Классно! Что нового?", new String[]{"Нашла новое хобби", "Делаю проект", "Рутина"}, new int[]{4, 5, 6}));
        statements.add(new Statement(2, "Понятно. Что нового?", new String[]{"Нашла новое хобби", "Делаю проект", "Рутина"}, new int[]{7, 8, 9}));
        statements.add(new Statement(3, "Хм, что-то случилось?", new String[]{"Нет. Нет настроения просто", "Да, я устал", "Я плохо себя чувствую"}, new int[]{10, 11, 12}));
    }

    public void createRoom2() {
        statements.clear();
        //room2.add
    }

    public void createRoom3() {
        statements.clear();
        //statements.add
    }

    public void createRoom4() {
        statements.clear();
        //statements.add
    }

    public void createRoom5() {
        statements.clear();
        //statements.add
    }

    public void createRoom6() {
        statements.clear();
        //statements.add
    }

    public void nextQuestion(int choose) {
        nowStat = null;
        for (Statement stat : statements) {
            if (choose == stat.getId()) nowStat = stat;
        }
        if (nowStat == null) {
            System.out.println("New questions coming soon...");
            return;
        }
        System.out.println(nowStat.getQuestion());
        int num = 0;
        for (String answer : nowStat.getAnswers()) {
            num++;
            System.out.println(num + " " + answer);
        }
        nextQuestion(nowStat.getIdAns()[but.nextInt() - 1]);
    }


}