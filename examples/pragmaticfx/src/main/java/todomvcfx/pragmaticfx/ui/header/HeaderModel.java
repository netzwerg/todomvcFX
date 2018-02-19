package todomvcfx.pragmaticfx.ui.header;

import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import todomvcfx.pragmaticfx.model.TodoItem;

public interface HeaderModel {

    StringProperty newItemTextProperty();

    ObservableList<TodoItem> getItems();
}
