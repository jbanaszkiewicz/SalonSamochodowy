package salon_samochodowy.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import salon_samochodowy.utils.FxmlUtils;

public class LoginController {
    public static final String BORDER_PANE_MAIN = "/fxml/BorderPaneMain.fxml";
    @FXML
    private BorderPane borderPane;

    public void loginBorderPaneMain(ActionEvent actionEvent) {
        borderPane.setCenter(FxmlUtils.fxmlLoader(BORDER_PANE_MAIN));

    }
}
