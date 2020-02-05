package com.totalcross.util;

import totalcross.sys.Settings;
import totalcross.ui.dialog.MessageBox;
import totalcross.ui.image.Image;

public class Images {
	// Declaring the variables.
	public static Image iLupa, iPerfil;

	// static double scale0060 = Settings.isIOS() ? 1 : 0.060;
	static double scale03 = Settings.isIOS() ? 1 : 0.15;
	// static double scale01 = Settings.isIOS() ? 1 : 0.1;
	// static double scale08 = Settings.isIOS() ? 1 : 0.8;
	
	
	public static void loadImages(){
		try {
			// Trying the initialize the variables.
			iLupa = new Image("images/Search.png");
			iPerfil = new Image("images/Perfil2.png");
			iPerfil = iPerfil.scaledBy(scale03, scale03);		

		
		} catch (Exception e) {
			MessageBox.showException(e, true);
		}	
	}
	
}