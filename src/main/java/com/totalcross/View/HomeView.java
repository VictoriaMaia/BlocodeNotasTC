package com.totalcross.View;
import com.totalcross.Util.*;

import totalcross.ui.Container;
import totalcross.ui.Label;
import totalcross.ui.ScrollContainer;
import totalcross.ui.Button;
import totalcross.ui.Edit;
import totalcross.ui.font.Font;

public class HomeView extends Container {
    // Declaring the variables.
    private Label lTitle1, lTitle2, lTitle3, lFeira1, lFeira2, lFeira3;
    private Container cBottom, cAnot1, cAnot2, cAnot3, cAnot4;
    private ScrollContainer scAnots;
    private Button bPesquisar;
    private Edit eBusca;

	public void initUI() {
        // Initializing the variables.
        // EDIT
        eBusca = new Edit();
        eBusca.caption = "Busque pelo titulo da nota";
        eBusca.setBackColor(Colors.COLOR_Light_ORANGE);
        eBusca.transparentBackground = true;


        // LABEL
        lTitle1 = new Label("Feira1");
        lTitle1.setFont(Font.getFont("Lato Bold", false, this.getFont().size+3));
        lTitle2 = new Label("Feira2");
        lTitle2.setFont(Font.getFont("Lato Bold", false, this.getFont().size+3));
        lTitle3 = new Label("Feira3");
        lTitle3.setFont(Font.getFont("Lato Bold", false, this.getFont().size+3));

        lFeira1 = new Label("Comprar:\n1-Pão\n2-Leite\n3-Ovo\n...");
        lFeira2 = new Label("Comprar:\n1-Pão\n2-Leite\n3-Ovo\n...");
        lFeira3 = new Label("Comprar:\n1-Pão\n2-Leite\n3-Ovo\n...");
        
        // BUTTON
        bPesquisar = new Button(Images.iLupa);
		bPesquisar.transparentBackground = true;
		bPesquisar.setBorder(Container.BORDER_NONE);
		bPesquisar.setDoEffect(false);

    
        // CONTAINER
        cBottom = new Container();

        cAnot1 = new Container();
        cAnot1.setBorderStyle(BORDER_ROUNDED);
        cAnot1.borderColor = Colors.COLOR_Light_ORANGE; 
        cAnot1.setBackColor(Colors.COLOR_Light_ORANGE);

        cAnot2 = new Container();
        cAnot2.setBorderStyle(BORDER_ROUNDED);
        cAnot2.borderColor = Colors.COLOR_Light_ORANGE;         
        cAnot2.setBackColor(Colors.COLOR_Light_ORANGE);

        cAnot3 = new Container();
        cAnot3.setBorderStyle(BORDER_ROUNDED);
        cAnot3.borderColor = Colors.COLOR_Light_ORANGE; 
        cAnot3.setBackColor(Colors.COLOR_Light_ORANGE);

        cAnot4 = new Container();
        cAnot4.setBorderStyle(BORDER_ROUNDED);
        cAnot4.borderColor = Colors.COLOR_Light_ORANGE; 
        cAnot4.setBackColor(Colors.COLOR_Light_ORANGE);
        

        // SCROOLCONTAINER
        scAnots = new ScrollContainer(false, true); //VERTICAL

        // ADDING THE CONTAINERS AND SCROLLCONTAINER IN HOME SCREE
        add(scAnots, LEFT, TOP, SCREENSIZE, SCREENSIZE+MaterialConstants.GAP80);
            scAnots.add(cAnot1, CENTER, AFTER+MaterialConstants.GAP15, PARENTSIZE+MaterialConstants.GAP90, PARENTSIZE+MaterialConstants.GAP30);
                cAnot1.add(lTitle1, LEFT, TOP);
                cAnot1.add(lFeira1, LEFT, AFTER+MaterialConstants.GAP4);
            scAnots.add(cAnot2, CENTER, AFTER+MaterialConstants.GAP10, PARENTSIZE+MaterialConstants.GAP90, PARENTSIZE+MaterialConstants.GAP30);
                cAnot2.add(lTitle2, LEFT, TOP);
                cAnot2.add(lFeira2, LEFT, AFTER+MaterialConstants.GAP4);
            scAnots.add(cAnot3, CENTER, AFTER+MaterialConstants.GAP10, PARENTSIZE+MaterialConstants.GAP90, PARENTSIZE+MaterialConstants.GAP30);
                cAnot3.add(lTitle3, LEFT, TOP);
                cAnot3.add(lFeira3, LEFT, AFTER+MaterialConstants.GAP4);

        add(cBottom, LEFT, BOTTOM, SCREENSIZE, SCREENSIZE+MaterialConstants.GAP10);
            cBottom.add(eBusca, LEFT, CENTER);
            cBottom.add(bPesquisar, RIGHT, CENTER);
	}
}

    // public void onEvent(Event event){
    //     if (event.type == ControlEvent.PRESSED){
    //         if (event.target == btn1){
    //             // ... handle btn1 being pressed
    //         }
    //     }
    // }
    