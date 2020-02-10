package com.totalcross;

import com.totalcross.util.*;
import com.totalcross.view.*;

import totalcross.ui.MainWindow;
import totalcross.ui.Container;
import totalcross.ui.Label;
import totalcross.ui.icon.Icon;
import totalcross.ui.SideMenuContainer;
import totalcross.ui.icon.MaterialIcons;
import totalcross.sys.Settings;
import totalcross.ui.ImageControl;

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

        SideMenuContainer.Item home = new SideMenuContainer.Item("Annotations", MaterialIcons._HOME, Colors.COLOR_ORANGE, ()-> {return new HomeView();});
        SideMenuContainer.Item create = new SideMenuContainer.Item("Create note", MaterialIcons._NOTE, Colors.COLOR_ORANGE, ()-> {return new CreateView();});

        sideMenu = new SideMenuContainer(null, home, create);

        sideMenu.topMenu.header = new Container(){
            public void initUI(){
                setBackColor(Colors.COLOR_DarkDark_ORANGE);

                ImageControl iUser = new ImageControl(Images.iPerfil);
                iUser.scaleToFit = true;
                
                Label lUser = new Label("User name", CENTER, Colors.COLOR_WHITE, false);
                lUser.setForeColor(Colors.COLOR_WHITE);

                Label lEmail = new Label("user@email.com", CENTER, Colors.COLOR_WHITE, false);
                lEmail.setForeColor(Colors.COLOR_WHITE);
                
                // lUser.setFont(Font.getFont("Lato Bold", false, this.getFont().size-1));
                // lEmail.setFont(Font.getFont("Lato Bold", false, this.getFont().size-1));

                add(iUser, LEFT+MaterialConstants.GAP15, TOP+MaterialConstants.GAP15);
                add(lUser, LEFT+MaterialConstants.GAP15, AFTER+MaterialConstants.GAP4);
                add(lEmail, LEFT+MaterialConstants.GAP15, AFTER+MaterialConstants.GAP4);
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
