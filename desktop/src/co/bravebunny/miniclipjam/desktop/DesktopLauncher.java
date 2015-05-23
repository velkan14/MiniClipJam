package co.bravebunny.miniclipjam.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import co.bravebunny.miniclipjam.MyCoffeGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width=MyCoffeGame.WIDTH; // sets window width
		config.height=MyCoffeGame.HEIGHT;  // sets window height
		new LwjglApplication(new MyCoffeGame(), config);
	}
}
