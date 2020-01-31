package com.totalcross.Util;

import totalcross.sys.Settings;
import totalcross.ui.dialog.MessageBox;
import totalcross.ui.image.Image;

public class Images {
	// Declaring the variables.
	public static Image iLupa, iBarras;
    //	static Font 
	static double scale0060 = Settings.isIOS() ? 1 : 0.060;
	static double scale03 = Settings.isIOS() ? 1 : 0.3;
	static double scale01 = Settings.isIOS() ? 1 : 0.1;
	// static double scale08 = Settings.isIOS() ? 1 : 0.8;
	
	
	public static void loadImages(){
		try {
			// Trying the initialize the variables.
            iLupa = new Image("images/search.png");
			iLupa = iLupa.scaledBy(scale0060, scale0060);		

			iBarras = new Image("images/barras.png");
			iBarras = iBarras.scaledBy(scale01, scale01);	

		
		} catch (Exception e) {
            
			MessageBox.showException(e, true);
		}	
	}
	
}