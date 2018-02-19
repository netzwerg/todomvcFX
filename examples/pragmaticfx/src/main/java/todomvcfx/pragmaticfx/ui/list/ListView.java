package todomvcfx.pragmaticfx.ui.list;

import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import todomvcfx.pragmaticfx.model.TodoItem;

public class ListView extends javafx.scene.control.ListView<TodoItem> {

    public ListView(ObservableList<TodoItem> items) {
        super(items);
        setId("items");
        setCellFactory(item -> new TodoItemListCell());
    }

    private static class TodoItemListCell extends ListCell<TodoItem> {
        @Override
        protected void updateItem(TodoItem item, boolean empty) {
            super.updateItem(item, empty);
            setText(null);
            if (empty) {
                setGraphic(null);
            } else {
                setGraphic(new TodoItemView(item));
            }
        }
    }

    private static class TodoItemView extends StackPane {

        TodoItemView(TodoItem item) {
            setAlignment(Pos.CENTER_LEFT);

            Label label = new Label(item.getText());
            label.setId("contentLabel");
            label.setMaxWidth(Double.MAX_VALUE);
            label.setMaxHeight(Double.MAX_VALUE);

            if (item.isCompleted()) {
                label.getStyleClass().add("strikethrough");
            }

            HBox hBox = new HBox();
            hBox.setId("contentBox");
            hBox.getStyleClass().add("content_box");

            HBox.setHgrow(label, Priority.ALWAYS);

            hBox.getChildren().add(label);

            getChildren().add(hBox);

        }

    }

}
