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
    private Button bPesquisar;
    private Edit eBusca;
    private Nota nTeste;

	public void initUI() {
        // Initializing the variables.

        // EDIT
        eBusca = new Edit();
        eBusca.caption = "Busque pelo titulo da nota";
        eBusca.setBackColor(Colors.COLOR_Light_ORANGE);
        eBusca.transparentBackground = true;


        // BUTTON
        bPesquisar = new Button(Images.iLupa);
		bPesquisar.transparentBackground = true;
		bPesquisar.setBorder(Container.BORDER_NONE);
		bPesquisar.setDoEffect(false);

        
        // NOTA
        nTeste = new Nota("TESTE", "Trabalho trabalho trabalho trabalho trabalho trabalho trabalho trabalho trabalho trabalho trabalho trabalho trabalho trabalho trabalho trabalho trabalho trabalho");
        

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
            cBottom.add(eBusca, LEFT, CENTER);
            cBottom.add(bPesquisar, RIGHT, CENTER);
	}
}
