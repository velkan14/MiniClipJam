package co.bravebunny.miniclipjam;

import com.badlogic.gdx.Game;

public class MyCoffeGame extends Game {
	public static final String TITLE="Game Project";
	public static final int WIDTH=480,HEIGHT=800; // used later to set window size

	@Override
	public void create() {
		setScreen(new co.bravebunny.miniclipjam.screens.Splash());
	}
}
