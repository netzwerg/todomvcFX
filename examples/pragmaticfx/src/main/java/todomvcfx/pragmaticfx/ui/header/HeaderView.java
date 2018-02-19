package todomvcfx.pragmaticfx.ui.header;

import javafx.beans.binding.Bindings;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class HeaderView extends VBox {

    public HeaderView(HeaderModel model, HeaderController controller) {

        getStylesheets().add(getClass().getResource("/header.css").toExternalForm());
        setAlignment(Pos.CENTER);

        Label title = new Label("Todos");
        title.setId("title");

        HBox addItemView = createAddItemView(model, controller);

        getChildren().addAll(title, addItemView);
    }

    private static HBox createAddItemView(HeaderModel model, HeaderController controller) {

        CheckBox checkBox = new CheckBox();
        checkBox.setId("selectAll");
        checkBox.visibleProperty().bind(Bindings.isNotEmpty(model.getItems()));

        TextField textField = new TextField();
        textField.textProperty().bindBidirectional(model.newItemTextProperty());
        textField.setId("addInput");
        textField.setPromptText("What needs to be done?");
        textField.setOnAction(e -> controller.addItem(textField.getText()));

        HBox.setHgrow(textField, Priority.ALWAYS);

        HBox view = new HBox();
        view.getStyleClass().add("add_item_root");
        view.setAlignment(Pos.CENTER_LEFT);
        view.getChildren().addAll(checkBox, textField);

        return view;
    }

}
