package todomvcfx.pragmaticfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import todomvcfx.pragmaticfx.ui.AppController;
import todomvcfx.pragmaticfx.ui.AppModel;
import todomvcfx.pragmaticfx.ui.AppView;

public final class PragmaticFXApp extends Application {

    @Override
    public void start(Stage stage) {

        AppModel model = new AppModel();
        AppController controller = new AppController(model);
        AppView view = new AppView(model, controller);

        Scene scene = new Scene(view);
        stage.setScene(scene);

        stage.show();

    }

    public static void main(String... args) {
        launch(args);
    }

}
