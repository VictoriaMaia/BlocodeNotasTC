package com.totalcross;

import com.totalcross.Util.*;
import com.totalcross.View.*;

import totalcross.ui.MainWindow;
import totalcross.ui.Container;
import totalcross.ui.Label;
import totalcross.ui.font.Font;
import totalcross.ui.icon.Icon;
import totalcross.ui.SideMenuContainer;
import totalcross.ui.icon.MaterialIcons;
import totalcross.sys.Settings;

public class SuasNotasApp extends MainWindow {
    SideMenuContainer sideMenu;
    
    public SuasNotasApp() {
        setUIStyle(Settings.MATERIAL_UI);
        // Settings.uiAdjustmentsBasedOnFontHeight = true;
    }

    @Override
    public void initUI() {
        // Initializing the images.
        Images.loadImages();

        // Swapping to the container responsible for showing the home screen.
        // swap(new HomeView());

        SideMenuContainer.Item home = new SideMenuContainer.Item("Anotações", MaterialIcons._HOME, Colors.COLOR_ORANGE, ()-> {return new HomeView();});
        SideMenuContainer.Item sample = new SideMenuContainer.Item("Criar nota", MaterialIcons._NOTE, Colors.COLOR_ORANGE, ()-> {return new CreateView();});

        sideMenu = new SideMenuContainer(null, home, sample);

        sideMenu.topMenu.header = new Container(){
            public void initUI(){
                setBackColor(Colors.COLOR_Dark_ORANGE);
                Label title = new Label("Suas Notas", CENTER, Colors.COLOR_WHITE, false);
                title.setForeColor(Colors.COLOR_WHITE);
                title.setFont(Font.getFont("Lato Bold", false, this.getFont().size+10));
                add(title, LEFT+MaterialConstants.GAP45, BOTTOM-MaterialConstants.GAP45);
                
            }
        };

        sideMenu.setBackColor(Colors.COLOR_DarkDark_ORANGE);
        sideMenu.setForeColor(Colors.COLOR_WHITE);
        sideMenu.setItemForeColor(Colors.COLOR_DarkDark_ORANGE);
        sideMenu.topMenu.drawSeparators = false;

        Icon icon = new Icon(MaterialIcons._MENU);
        icon.setBackColor(Colors.COLOR_ORANGE);
        add(icon, CENTER, TOP);
        add(sideMenu, LEFT, TOP, PARENTSIZE, PARENTSIZE);

    }
}
