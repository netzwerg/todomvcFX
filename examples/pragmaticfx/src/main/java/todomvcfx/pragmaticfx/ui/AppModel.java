package todomvcfx.pragmaticfx.ui;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import todomvcfx.pragmaticfx.model.TodoItem;
import todomvcfx.pragmaticfx.ui.header.HeaderModel;

public class AppModel implements HeaderModel {

    private final StringProperty newItemText = new SimpleStringProperty("");
    private final ObservableList<TodoItem> items = FXCollections.observableArrayList();

    @Override
    public StringProperty newItemTextProperty() {
        return newItemText;
    }

    @Override
    public ObservableList<TodoItem> getItems() {
        return items;
    }

}
