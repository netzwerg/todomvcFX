package todomvcfx.pragmaticfx.ui;

import todomvcfx.pragmaticfx.model.TodoItem;
import todomvcfx.pragmaticfx.ui.header.HeaderController;

public final class AppController implements HeaderController {

    private final AppModel model;

    public AppController(AppModel model) {
        this.model = model;
    }

    @Override
    public void addItem(String text) {
        model.getItems().add(new TodoItem(text, false));
        model.newItemTextProperty().setValue("");
    }

}
