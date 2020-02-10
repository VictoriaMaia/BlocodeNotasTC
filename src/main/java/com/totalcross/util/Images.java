package com.totalcross.util;

import totalcross.sys.Settings;
import totalcross.ui.dialog.MessageBox;
import totalcross.ui.image.Image;

public class Images {
	// Declaring the variables.
	public static Image iLupa, iPerfil;

	static double scale015 = Settings.isIOS() ? 1 : 0.15;
	
	public static void loadImages(){
		try {
			// Trying the initialize the variables.
			iLupa = new Image("images/Search.png");

			iPerfil = new Image("images/Perfil2.png");
			iPerfil = iPerfil.scaledBy(scale015, scale015);		

		} catch (Exception e) {
			MessageBox.showException(e, true);
		}	
	}
	
}