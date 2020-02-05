package com.totalcross.view.components;

import com.totalcross.model.*;
import com.totalcross.util.*;
import totalcross.ui.Container;
import totalcross.ui.Label;

public class NotaPreviewContainer extends Container{
    private Nota nota;
    private Label lTitle;
    private Label lDescription;

    public NotaPreviewContainer(Nota nota){
        this.nota = nota;
    }

    public void initUI() {
        setBorderStyle(BORDER_ROUNDED);
        borderColor = Colors.COLOR_Light_ORANGE; 
        setBackColor(Colors.COLOR_Light_ORANGE);

        lTitle = new Label(nota.getTitle());
        lDescription = new Label(nota.getDescription(), FILL);
        lDescription.autoSplit = true;

        add(lTitle, LEFT+MaterialConstants.GAP4, TOP+MaterialConstants.GAP4, PARENTSIZE, PARENTSIZE+MaterialConstants.GAP10);
        add(lDescription, LEFT+MaterialConstants.GAP4, AFTER+MaterialConstants.GAP10, PARENTSIZE+MaterialConstants.GAP90, PARENTSIZE+MaterialConstants.GAP80);

    }
    
}