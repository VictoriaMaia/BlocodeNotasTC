package com.totalcross.view;

import com.totalcross.util.Colors;
import com.totalcross.util.MaterialConstants;
import totalcross.ui.Container;
import totalcross.ui.Button;
import totalcross.ui.Edit;
import totalcross.ui.MultiEdit;
import totalcross.ui.Label;
import totalcross.ui.dialog.MessageBox;

public class CreateView extends Container {
    // Declaring the variables.
    private Label lTitle, lNote;
    private Container cNewNote, cOptions;
    private Button bSave, bCancel;
    private Edit eTitle;
    private MultiEdit eNote;

	public void initUI() {
        // Initializing the variables.
        lTitle = new Label("Title: ");
        lNote = new Label("Note: ");

        // EDIT
        eTitle = new Edit();
        eTitle.setBackColor(Colors.COLOR_ORANGE);

        eNote = new MultiEdit();
        eNote.setBackColor(Colors.COLOR_ORANGE);

        // BUTTON
        bSave = new Button("SAVE");
        bSave.setBackForeColors(Colors.COLOR_Dark_ORANGE, Colors.COLOR_WHITE);
		bSave.setBorder(Container.BORDER_ROUNDED);
        bSave.setDoEffect(false);
        
        bCancel = new Button("CANCEL");
        bCancel.setBackForeColors(Colors.COLOR_Dark_ORANGE, Colors.COLOR_WHITE);
		bCancel.setBorder(Container.BORDER_ROUNDED);
		bCancel.setDoEffect(false);
    
        // CONTAINER
        cNewNote = new Container();
        cOptions = new Container();
        

        // ADDING THE CONTAINERS AND SCROLLCONTAINER IN HOME SCREE
        add(cNewNote, LEFT, TOP, SCREENSIZE, SCREENSIZE+MaterialConstants.GAP80);
            cNewNote.add(lTitle, LEFT, TOP, PARENTSIZE, PARENTSIZE+MaterialConstants.GAP4);
            cNewNote.add(eTitle, LEFT, AFTER+MaterialConstants.GAP4, PARENTSIZE, PARENTSIZE+MaterialConstants.GAP10);
            cNewNote.add(lNote, LEFT, AFTER+MaterialConstants.GAP4, PARENTSIZE, PARENTSIZE+MaterialConstants.GAP4);
            cNewNote.add(eNote, LEFT, AFTER+MaterialConstants.GAP10, PARENTSIZE, PARENTSIZE+MaterialConstants.GAP60);
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

