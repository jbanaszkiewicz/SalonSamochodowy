package salon_samochodowy;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import salon_samochodowy.utils.FxmlUtils;

import java.util.Locale;

public class Main extends Application {

    public static final String BORDER_PANE_MAIN = "/fxml/BorderPaneMain.fxml";
    public static final String LOGIN = "/fxml/Login.fxml";

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Locale.setDefault(new Locale("pl"));
        Pane borderPane = FxmlUtils.fxmlLoader(BORDER_PANE_MAIN);
        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle(FxmlUtils.getResourceBundle().getString("title.application"));
        primaryStage.show();
    }
}
