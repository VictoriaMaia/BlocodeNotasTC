package com.totalcross.View;
import com.totalcross.Util.*;

import totalcross.ui.Container;
import totalcross.ui.ScrollContainer;
import totalcross.ui.Button;
import totalcross.ui.Edit;
import totalcross.ui.MultiEdit;
import totalcross.ui.Label;

public class CreateView extends Container {
    // Declaring the variables.
    private Label lTitle, lNote;
    private Container cNovaNota, cOptions;
    private Button bSave, bCancel;
    private Edit eTitle;
    private MultiEdit eNote;

	public void initUI() {
        // Initializing the variables.
        lTitle = new Label("Título: ");
        lNote = new Label("Nota: ");

        // EDIT
        eTitle = new Edit();
        // eTitle.caption = "OutlinedEdit";
        // eTitle.captionColor = Colors.COLOR_RED;
        eTitle.setBackColor(Colors.COLOR_ORANGE);
        // eTitle.transparentBackground = true;

        eNote = new MultiEdit();
        // eNote.caption = "OutlinedEdit";
        // eNote.captionColor = Colors.COLOR_RED;
        eNote.setBackColor(Colors.COLOR_ORANGE);
        // eNote.transparentBackground = true;

        // BUTTON
        bSave = new Button("SALVAR");
        // bSave.transparentBackground = true;
        bSave.setBackForeColors(Colors.COLOR_Dark_ORANGE, Colors.COLOR_WHITE);
		bSave.setBorder(Container.BORDER_ROUNDED);
        bSave.setDoEffect(false);
        
        bCancel = new Button("CANCELAR");
        // bCancel.transparentBackground = true;
        bCancel.setBackForeColors(Colors.COLOR_Dark_ORANGE, Colors.COLOR_WHITE);
		bCancel.setBorder(Container.BORDER_ROUNDED);
		bCancel.setDoEffect(false);
    
        // CONTAINER
        cNovaNota = new Container();
        cOptions = new Container();
        // cNote = newContainer();
        

        // ADDING THE CONTAINERS AND SCROLLCONTAINER IN HOME SCREE
        add(cNovaNota, LEFT, TOP, SCREENSIZE, SCREENSIZE+MaterialConstants.GAP80);
            cNovaNota.add(lTitle, LEFT, TOP, PARENTSIZE, PARENTSIZE+MaterialConstants.GAP4);
            cNovaNota.add(eTitle, LEFT, AFTER+MaterialConstants.GAP4, PARENTSIZE, PARENTSIZE+MaterialConstants.GAP10);
            cNovaNota.add(lNote, LEFT, AFTER+MaterialConstants.GAP4, PARENTSIZE, PARENTSIZE+MaterialConstants.GAP4);
            cNovaNota.add(eNote, LEFT, AFTER+MaterialConstants.GAP10, PARENTSIZE, PARENTSIZE+MaterialConstants.GAP60);
        add(cOptions, LEFT, AFTER, SCREENSIZE, SCREENSIZE+MaterialConstants.GAP15);
            cOptions.add(bSave, LEFT+MaterialConstants.GAP10, TOP);
            cOptions.add(bCancel, RIGHT-MaterialConstants.GAP10, TOP);

	}
}

    // public void onEvent(Event event){
    //     if (event.type == ControlEvent.PRESSED){
    //         if (event.target == btn1){
    //             // ... handle btn1 being pressed
    //         }
    //     }
    // }
    