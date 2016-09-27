package com.andychan.mazinggame.Scenes;

import com.andychan.mazinggame.MazingGame;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;



/**
 * Created by Andy on 9/26/2016.
 */

public class Hud {
    public Stage stage;
    // new viewport so that Hud stays the same and game can move independently
    private Viewport viewport;

    private Integer worldTimer;
    private float timeCount;
    private Integer score;

    Label countdownLabel;
    Label scoreLabel;
    Label levelLabel;

    public Hud(SpriteBatch sb){
        worldTimer = 300;
        timeCount = 0;
        score = 0;

        viewport = new FitViewport(MazingGame.V_WIDTH, MazingGame.V_HEIGHT, new OrthographicCamera());
        stage = new Stage(viewport, sb);

        Table table = new Table();
        // Alligns our table to the top
        table.top();
        // Makes table to the size of the stage
        table.setFillParent(true);

        countdownLabel = new Label(String.format("%03d", worldTimer), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        scoreLabel = new Label(String.format("%06d", score), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        levelLabel =  new Label("LEVEL", new Label.LabelStyle(new BitmapFont(), Color.WHITE));

        table.add(countdownLabel).expandX().padTop(20);
        table.add(levelLabel).expandX().padTop(20);
        table.add(scoreLabel).expandX().padTop(20);

        stage.addActor(table);
    }
}
