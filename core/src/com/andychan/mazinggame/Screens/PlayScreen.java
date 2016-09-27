package com.andychan.mazinggame.Screens;

import com.andychan.mazinggame.MazingGame;
import com.andychan.mazinggame.Scenes.Hud;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by Andy on 9/26/2016.
 */

public class PlayScreen implements Screen{
    private MazingGame game;

    private TmxMapLoader mapLoader;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;

    private OrthographicCamera gameCam;
    private Viewport gamePort;
    private Hud hud;

    public PlayScreen(MazingGame game){
        this.game = game;
    }

    @Override
    public void show() {
        gameCam = new OrthographicCamera();
        gamePort = new FitViewport(MazingGame.V_WIDTH, MazingGame.V_HEIGHT, gameCam);
        mapLoader = new TmxMapLoader();
        map = mapLoader.load("map.tmx");
        renderer = new OrthogonalTiledMapRenderer(map);
        gameCam.position.set(gamePort.getWorldWidth() / 2, gamePort.getWorldHeight()/2, 0);
        hud = new Hud(game.batch);
    }

    public void handleInput(float dt){
    }

    public void update(float dt){
        handleInput(dt);
        gameCam.update();

    }

    @Override
    public void render(float delta) {
        update(delta);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        renderer.setView(gameCam);
        renderer.render();

        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        hud.stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        gamePort.update(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
