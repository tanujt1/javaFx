package employee.view;

import employee.Main;
import javafx.fxml.FXML;

import java.io.IOException;

public class MainViewController {

    @FXML
    private void goHome() throws IOException {
        Main.showMainItems();
    }

    @FXML
    private void addButton() throws IOException {
        Main.showAddStage();
    }

}
