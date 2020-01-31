package com.totalcross;

import com.totalcross.Util.Images;
import com.totalcross.View.HomeView;

import totalcross.ui.MainWindow;
import totalcross.sys.Settings;

public class SuasNotasApp extends MainWindow {
    
    public SuasNotasApp() {
        setUIStyle(Settings.MATERIAL_UI);
    }

    @Override
    public void initUI() {
        // Initializing the images.
        Images.loadImages();

        // Swapping to the container responsible for showing the home screen.
        swap(new HomeView());
    }
}
