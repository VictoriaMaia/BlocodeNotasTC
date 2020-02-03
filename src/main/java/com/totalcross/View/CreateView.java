package com.totalcross.View;
import com.totalcross.Util.*;

import totalcross.ui.Container;
import totalcross.ui.Label;
import totalcross.ui.ScrollContainer;
import totalcross.ui.Button;
import totalcross.ui.Edit;

public class CreateView extends Container {
    // Declaring the variables.
    // private Label lTitle, lNote;
    private Container cNovaNota, cOptions;
    private ScrollContainer scNote;
    private Button bSave, bCancel;
    private Edit eTitle, eNote;

	public void initUI() {
        // Initializing the variables.
        // EDIT
        eTitle = new Edit();
        eTitle.caption = "Título: ";
        eTitle.setBackColor(Colors.COLOR_Light_ORANGE);
        eTitle.transparentBackground = true;

        eNote = new Edit();
        eNote.caption = "Nota: ";
        eNote.setBackColor(Colors.COLOR_Light_ORANGE);
        eNote.transparentBackground = true;

        // LABEL
        // lTitle = new Label("Feira1");
        
        // BUTTON
        bSave = new Button("SALVAR");
		bSave.transparentBackground = true;
		bSave.setBorder(Container.BORDER_NONE);
        bSave.setDoEffect(false);
        
        bCancel = new Button("CANCELAR");
		bCancel.transparentBackground = true;
		bCancel.setBorder(Container.BORDER_NONE);
		bCancel.setDoEffect(false);
    
        // CONTAINER
        cNovaNota = new Container();
        cOptions = new Container();
        
        // SCROOLCONTAINER
        scNote = new ScrollContainer(false, true); //VERTICAL

        // ADDING THE CONTAINERS AND SCROLLCONTAINER IN HOME SCREE
        add(cNovaNota, LEFT, TOP, SCREENSIZE, SCREENSIZE+MaterialConstants.GAP80);
            cNovaNota.add(eTitle, LEFT, TOP, PARENTSIZE, PARENTSIZE+MaterialConstants.GAP30);
            cNovaNota.add(scNote, LEFT, AFTER+MaterialConstants.GAP10, PARENTSIZE, PARENTSIZE+MaterialConstants.GAP45);
            scNote.add(eNote, LEFT, TOP, PARENTSIZE, PARENTSIZE);
        add(cOptions, LEFT, AFTER, SCREENSIZE, SCREENSIZE+MaterialConstants.GAP15);
            cOptions.add(bSave, LEFT, CENTER);
            cOptions.add(bCancel, RIGHT, CENTER);

	}
}

    // public void onEvent(Event event){
    //     if (event.type == ControlEvent.PRESSED){
    //         if (event.target == btn1){
    //             // ... handle btn1 being pressed
    //         }
    //     }
    // }
    