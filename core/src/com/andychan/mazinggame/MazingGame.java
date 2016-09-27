package com.andychan.mazinggame;

import com.andychan.mazinggame.Screens.PlayScreen;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MazingGame extends Game {
	public SpriteBatch batch;
	public static final int V_WIDTH = 480;
	public static final int V_HEIGHT = 800;

	public static int tileWidth;
	public static int tileWidth;
	public static int tileWidth;
	public static int tileWidth;
	public static int tileWidth;
	public static int tileWidth;
	public static int tileWidth;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new PlayScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
}
