package com.helga.femalelogic;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.utils.Array;

import java.util.Scanner;

public class Main extends ApplicationAdapter {
    public Statement ask;
    public GameProcess gameProcess;
    private int choseR;
    private int nows;



    @Override
    public void create() {
        gameProcess = new GameProcess();
        ask = new Statement(0, "Привет! Выбири комнату", new String[]{"Лучшая подруга", "Магазин", "Ресторан", "Парень", "Свекровь", "Путешествие"}, new int[]{1, 2, 3, 4, 5, 6});
        System.out.println(ask.getQuestion());
        nows = 0;
        for (String stat : ask.getAnswers()) {
            nows++;
            System.out.println(nows + " " +  stat);
        }



        choseR = gameProcess.but.nextInt();
        if (choseR == 1) gameProcess.createRoom1();
        else if (choseR == 2) gameProcess.createRoom2();
        else if (choseR == 3) gameProcess.createRoom3();
        else if (choseR == 4) gameProcess.createRoom4();
        else if (choseR == 5) gameProcess.createRoom5();
        else if (choseR == 6) gameProcess.createRoom6();
        gameProcess.nextQuestion(0);
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void dispose() {

    }
}

