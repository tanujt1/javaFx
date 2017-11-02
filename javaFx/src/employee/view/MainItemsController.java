package employee.view;

import employee.Main;
import javafx.fxml.FXML;

import java.io.IOException;

public class MainItemsController {

    @FXML
    private void electrical() throws IOException {

        Main.showElectricalScene();
    }

    @FXML
    private void mechanical() throws IOException {

        Main.showMechanicalScene();
    }

}
