package todomvcfx.pragmaticfx.ui;

import javafx.scene.layout.VBox;
import todomvcfx.pragmaticfx.ui.footer.FooterView;
import todomvcfx.pragmaticfx.ui.header.HeaderView;
import todomvcfx.pragmaticfx.ui.list.ListView;

public class AppView extends VBox {

    public AppView(AppModel model, AppController controller) {

        getChildren().addAll(
                new HeaderView(model, controller),
                new ListView(model.getItems()),
                new FooterView()
        );

    }

}
