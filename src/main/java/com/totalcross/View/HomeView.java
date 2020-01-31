package com.totalcross.View;
import com.totalcross.Util.Colors;
import com.totalcross.Util.Images;

import totalcross.ui.Container;
import totalcross.ui.Label;
import totalcross.ui.ScrollContainer;
import totalcross.ui.Button;


public class HomeView extends Container {
    // Declaring the variables.
    private Label lTitulo, lFeira1, lFeira2, lFeira3;
    private Container cTop, cAnot1, cAnot2, cAnot3, cAnot4, cAnot5;
    private ScrollContainer scAnots;
    private Button bPesquisar, bOpces;
    
	public void initUI() {
        // Initializing the variables.

        // LABELS
        lTitulo = new Label("Anotações");
        lTitulo.setForeColor(Colors.COLOR_WHITE);

        lFeira1 = new Label("Ir na feira comprar:\n1-Pão\n2-Leite\n3-Ovo\n...");
        lFeira2 = new Label("Ir na feira comprar:\n1-Pão\n2-Leite\n3-Ovo\n...");
        lFeira3 = new Label("Ir na feira comprar:\n1-Pão\n2-Leite\n3-Ovo\n...");
        
        // BUTTON
        bPesquisar = new Button(Images.iLupa);
		bPesquisar.transparentBackground = true;
		bPesquisar.setBorder(Container.BORDER_NONE);
		bPesquisar.setDoEffect(false);

        bOpces = new Button(Images.iBarras);
		bOpces.transparentBackground = true;
		bOpces.setBorder(Container.BORDER_NONE);
		bOpces.setDoEffect(false);


        // CONTAINER
        cTop = new Container();
        cTop.setBackColor(Colors.COLOR_ORANGE);

        cAnot1 = new Container();
        cAnot1.setBackColor(Colors.COLOR_Light_ORANGE);

        cAnot2 = new Container();
        cAnot2.setBackColor(Colors.COLOR_Light_ORANGE);

        cAnot3 = new Container();
        cAnot3.setBackColor(Colors.COLOR_Light_ORANGE);

        cAnot4 = new Container();
        cAnot4.setBackColor(Colors.COLOR_Light_ORANGE);

        cAnot5 = new Container();
        cAnot5.setBackColor(Colors.COLOR_Light_ORANGE);


        // SCROOLCONTAINER
        scAnots = new ScrollContainer(false, true); //VERTICAL

        // ADDING THE CONTAINERS AND SCROLLCONTAINER IN HOME SCREE
        add(cTop, LEFT, TOP, SCREENSIZE, SCREENSIZE+10);
            cTop.add(lTitulo, CENTER, CENTER);
            cTop.add(bPesquisar, RIGHT, CENTER);
            cTop.add(bOpces, LEFT, CENTER);

        add(scAnots, LEFT, AFTER, SCREENSIZE, SCREENSIZE+90);
            scAnots.add(cAnot1, CENTER, AFTER+15, PARENTSIZE+90, PARENTSIZE+30);
                cAnot1.add(lFeira1, LEFT, TOP);
            scAnots.add(cAnot2, CENTER, AFTER+10, PARENTSIZE+90, PARENTSIZE+30);
                cAnot2.add(lFeira2, LEFT, TOP);
            scAnots.add(cAnot3, CENTER, AFTER+10, PARENTSIZE+90, PARENTSIZE+30);
                cAnot3.add(lFeira3, LEFT, TOP);
            scAnots.add(cAnot4, CENTER, AFTER+10, PARENTSIZE+90, PARENTSIZE+30);
            scAnots.add(cAnot5, CENTER, AFTER+10, PARENTSIZE+90, PARENTSIZE+30);
	}
}