package com.helga.femalelogic.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.helga.femalelogic.Main;

public class DesktopLauncher {



	public static void main(String[] arg) {


		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 1200;
		config.height = 750;
//		config.fullscreen = true;
		new LwjglApplication(new Main(), config);
	}

}

