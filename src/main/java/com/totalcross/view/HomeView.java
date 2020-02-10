package com.totalcross.view;

import com.totalcross.util.*;
import com.totalcross.model.Nota;
import com.totalcross.view.components.*;

import totalcross.ui.Container;
import totalcross.ui.ScrollContainer;
import totalcross.ui.Button;
import totalcross.ui.Edit;

public class HomeView extends Container {
    // Declaring the variables.
    private NotaPreviewContainer cAnot;
    private Container cBottom;
    private ScrollContainer scAnots;
    private Button bSearch;
    private Edit eSearch;
    private Nota nTeste;

	public void initUI() {
        // Initializing the variables.

        // EDIT
        eSearch = new Edit();
        eSearch.caption = "Search for the note title";
        eSearch.transparentBackground = true;


        // BUTTON
        bSearch = new Button(Images.iLupa);
		bSearch.transparentBackground = true;
		bSearch.setBorder(Container.BORDER_NONE);
		bSearch.setDoEffect(false);

        
        // NOTA
        nTeste = new Nota("TEST", "test test test test test test test test test test test test test test test");
        

        // NOTAPREVIEWCONTAINER
        cAnot = new NotaPreviewContainer(nTeste);


        // CONTAINER
        cBottom = new Container();
        

        // SCROOLCONTAINER
        scAnots = new ScrollContainer(false, true); //VERTICAL

        
        // ADDING THE ELEMENTS IN HOME SCREE
        add(scAnots, LEFT, TOP, SCREENSIZE, SCREENSIZE+MaterialConstants.GAP80);
            scAnots.add(cAnot, CENTER, AFTER+MaterialConstants.GAP15, PARENTSIZE+MaterialConstants.GAP90, PARENTSIZE+MaterialConstants.GAP30);
            
        add(cBottom, LEFT, BOTTOM, SCREENSIZE, SCREENSIZE+MaterialConstants.GAP10);
            cBottom.add(eSearch, LEFT, CENTER);
            cBottom.add(bSearch, RIGHT, CENTER);
	}
}
