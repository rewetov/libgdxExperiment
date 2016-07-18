package com.mynew.simpleproject.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mynew.simpleproject.MySimpleGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = MySimpleGame.WIDTH;
		config.height = MySimpleGame.HEIGHT;
		new LwjglApplication(new MySimpleGame(), config);
	}
}
