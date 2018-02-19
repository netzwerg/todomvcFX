package todomvcfx.pragmaticfx.ui.footer;

import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;

public class FooterView extends HBox {

    public FooterView() {

        Label label = new Label("0 items left");
        label.setId("itemsLeftLabel");

        ToggleGroup toggleGroup = new ToggleGroup();

        ToggleButton showAllButton = new ToggleButton("All");
        showAllButton.setId("showAll");
        showAllButton.setToggleGroup(toggleGroup);
        showAllButton.setSelected(true);

        ToggleButton showActive = new ToggleButton("Active");
        showActive.setId("showActive");
        showActive.setToggleGroup(toggleGroup);
        showActive.setSelected(false);

        ToggleButton showCompleted = new ToggleButton("Completed");
        showCompleted.setId("showCompleted");
        showCompleted.setToggleGroup(toggleGroup);
        showCompleted.setSelected(false);

        getChildren().addAll(label, showAllButton, showActive, showCompleted);
    }

}