package employee;

import employee.view.ShowInformationController;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage primaryStage;
    private static BorderPane mainLayout;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Employee App");
        showMainView();
        showMainItems();
    }

    public void showMainView() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/MainView.fxml"));
        mainLayout = loader.load();

        Scene scene = new Scene(mainLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void showMainItems() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/MainItems.fxml"));
        BorderPane mainItems = loader.load();
        mainLayout.setCenter(mainItems);

    }

    public static void showElectricalScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("electrical/ElectricalDep.fxml"));
        BorderPane electricalDep = loader.load();
        mainLayout.setCenter(electricalDep);

    }

    public static void showMechanicalScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("mechanical/MechanicalDep.fxml"));
        BorderPane electricalDep = loader.load();
        mainLayout.setCenter(electricalDep);

    }

    public static void showAddStage() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/AddNewEmployee.fxml"));
        BorderPane addNewEmployee = loader.load();

        Stage addDialogStage = new Stage();
        addDialogStage.setTitle("Add new Employee");
        addDialogStage.initModality(Modality.WINDOW_MODAL);
        addDialogStage.initOwner(primaryStage);

        Scene scene = new Scene(addNewEmployee);
        addDialogStage.setScene(scene);
        addDialogStage.showAndWait();
    }

    public static void showInformation(String name, String addressText, String cityText, String phoneText, String emailText) throws IOException {

        ShowInformationController.setAll(name, addressText, cityText, phoneText, emailText);

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view/showInformation.fxml"));
        BorderPane showInformation = loader.load();

        Stage addDialogStage = new Stage();
        addDialogStage.setTitle("Information");
        addDialogStage.initModality(Modality.NONE);
        addDialogStage.initOwner(primaryStage);

        Scene scene = new Scene(showInformation);
        addDialogStage.setScene(scene);
        addDialogStage.showAndWait();

    }

}
