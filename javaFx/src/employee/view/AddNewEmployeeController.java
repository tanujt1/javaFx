package employee.view;

import employee.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Calendar;
import java.util.Observable;


public class AddNewEmployeeController {

    ObservableList<String> maritalStatusList = FXCollections.observableArrayList("Single", "Married");

    ObservableList<String> departmentList = FXCollections.observableArrayList("Electrical", "Mechanical");

    ObservableList<String> electricalList = FXCollections.observableArrayList("Design", "R&D");

    ObservableList<String> mechanicalList = FXCollections.observableArrayList("sales", "Management");
    // Contact Informaion

    @FXML
    private TextField name;
    @FXML
    private TextField address;
    @FXML
    private TextField city;
    @FXML
    private TextField phone;
    @FXML
    private TextField email;

    // closing the window
    @FXML
    public void handleCloseButtonAction(ActionEvent event) {
        ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
    }

    // Personal Information

    @FXML
    private DatePicker dateOfBirth;

    @FXML
    private TextField ageField;

    @FXML
    private ChoiceBox maritalStatus;

    @FXML
    private RadioButton male;

    @FXML
    private RadioButton female;

    // Employee information
    @FXML
    private TextField id;

    @FXML
    private ComboBox department;

    @FXML
    private ComboBox domain;

    @FXML
    private void initialize() {
        maritalStatus.setValue("Single");
        maritalStatus.setItems(maritalStatusList);

        department.setValue("Electrical");
        department.setItems(departmentList);

        domain.setValue("Design");
        domain.setItems(electricalList);
    }


    @FXML
    private void showAge() {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        int birthYear = dateOfBirth.getValue().getYear();
        int age = currentYear - birthYear;
        ageField.setText(Integer.toString(age) + "years");
    }

    @FXML
    private void changeDomain() {
        if (department.getValue().equals("Electrical")) {
            domain.setValue("Design");
            domain.setItems(electricalList);
        } else {
            domain.setValue("Sales");
            domain.setItems(mechanicalList);
        }
    }

    @FXML
    private void showDetails() throws IOException {
       /* ShowInformationController sic = new ShowInformationController();
        sic.setAll(name.getText(), address.getText(), city.getText(), phone.getText(), email.getText());*/
        System.out.println(name.getText());
    Main.showInformation(name.getText(), address.getText(), city.getText(), phone.getText(), email.getText());
    }

}
