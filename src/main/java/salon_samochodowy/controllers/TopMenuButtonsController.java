package salon_samochodowy.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

public class TopMenuButtonsController {
    public static final String LIBRARY = "/fxml/Library.fxml";
    public static final String LISTBOOKS = "/fxml/ListBooks.fxml";
    public static final String STATISTICS = "/fxml/Statistics.fxml";
    public static final String ADD_BOOK_FXML = "/fxml/AddBook.fxml";
    public static final String OPEN_LOGIN = "/fxml/Login.fxml";

    private MainController mainController;
    @FXML
    private ToggleGroup toggleButtons;
    @FXML
    public void openLibrary() {
        this.mainController.setCenter(LIBRARY);
    }

    public void openListBooks() {
        this.mainController.setCenter(LISTBOOKS);
    }

    public void openStatistics() {
        this.mainController.setCenter(STATISTICS);
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public void addBook(ActionEvent actionEvent) {
        if (toggleButtons.getSelectedToggle() != null){
            toggleButtons.getSelectedToggle().setSelected(false);
        }
        this.mainController.setCenter(ADD_BOOK_FXML);
    }

    public void openLogin(ActionEvent actionEvent) {
        this.mainController.setCenter(OPEN_LOGIN);
    }
}
