package com.totalcross.view;

import com.totalcross.util.*;
import totalcross.ui.Container;
import totalcross.ui.Button;
import totalcross.ui.Edit;
import totalcross.ui.MultiEdit;
import totalcross.ui.Label;
import totalcross.ui.dialog.MessageBox;

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
        eTitle.setBackColor(Colors.COLOR_ORANGE);

        eNote = new MultiEdit();
        eNote.setBackColor(Colors.COLOR_ORANGE);

        // BUTTON
        bSave = new Button("SALVAR");
        bSave.setBackForeColors(Colors.COLOR_Dark_ORANGE, Colors.COLOR_WHITE);
		bSave.setBorder(Container.BORDER_ROUNDED);
        bSave.setDoEffect(false);
        
        bCancel = new Button("CANCELAR");
        bCancel.setBackForeColors(Colors.COLOR_Dark_ORANGE, Colors.COLOR_WHITE);
		bCancel.setBorder(Container.BORDER_ROUNDED);
		bCancel.setDoEffect(false);
    
        // CONTAINER
        cNovaNota = new Container();
        cOptions = new Container();
        

        // ADDING THE CONTAINERS AND SCROLLCONTAINER IN HOME SCREE
        add(cNovaNota, LEFT, TOP, SCREENSIZE, SCREENSIZE+MaterialConstants.GAP80);
            cNovaNota.add(lTitle, LEFT, TOP, PARENTSIZE, PARENTSIZE+MaterialConstants.GAP4);
            cNovaNota.add(eTitle, LEFT, AFTER+MaterialConstants.GAP4, PARENTSIZE, PARENTSIZE+MaterialConstants.GAP10);
            cNovaNota.add(lNote, LEFT, AFTER+MaterialConstants.GAP4, PARENTSIZE, PARENTSIZE+MaterialConstants.GAP4);
            cNovaNota.add(eNote, LEFT, AFTER+MaterialConstants.GAP10, PARENTSIZE, PARENTSIZE+MaterialConstants.GAP60);
        add(cOptions, LEFT, AFTER, SCREENSIZE, SCREENSIZE+MaterialConstants.GAP15);
            cOptions.add(bSave, LEFT+MaterialConstants.GAP10, TOP);
            cOptions.add(bCancel, RIGHT-MaterialConstants.GAP10, TOP);

        bCancel.addPressListener((event) -> {
            try{
                eTitle.setText("");
                eNote.setText("");
            }catch (Exception ee) {
				MessageBox.showException(ee, true);
			}
        });

	}
}

