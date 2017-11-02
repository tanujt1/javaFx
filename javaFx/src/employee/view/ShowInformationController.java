package employee.view;

import employee.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ShowInformationController implements Initializable {

    @FXML private TableView<UserDetails> tableview;
    @FXML private TableColumn<UserDetails, String> name;
    @FXML private TableColumn<UserDetails, String> city;
    @FXML private TableColumn<UserDetails, String> email;
    @FXML private TableColumn<UserDetails, String> address;
    @FXML private TableColumn<UserDetails, String> phone;

   // Received from application
    static  String receivedName;
    static String receivedAddress;
    static String receivedCity;
    static String receivedPhone;
    static String receivedEmail;




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        name.setCellValueFactory(new PropertyValueFactory<UserDetails, String>("name"));
        city.setCellValueFactory(new PropertyValueFactory<UserDetails, String>("city"));
        email.setCellValueFactory(new PropertyValueFactory<UserDetails, String>("email"));
        address.setCellValueFactory(new PropertyValueFactory<UserDetails, String>("address"));
        phone.setCellValueFactory(new PropertyValueFactory<UserDetails, String>("phone"));

        tableview.setItems(getInfo());

    }


    public static void setAll(String receivedNam,String receivedAddres,String receivedCit,String receivedPhon,String receivedEmai) throws IOException {
    receivedName=receivedNam;
    receivedAddress=receivedAddres;
    receivedCity=receivedCit;
    receivedPhone=receivedPhon;
    receivedEmail=receivedEmai;
    }

    public  ObservableList<UserDetails> getInfo() {

        ObservableList<UserDetails> info = FXCollections.observableArrayList();
        info.add(new UserDetails(receivedName, receivedAddress, receivedCity, receivedPhone, receivedEmail));
        return  info;
    }


}
