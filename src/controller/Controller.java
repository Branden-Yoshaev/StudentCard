package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
            @FXML
            private MenuBar studentCard;

            @FXML
            private Label firstName;

            @FXML
            private Label firstName_Label;

            @FXML
            private Label lastName;

            @FXML
            private Label lastName_Label;

            @FXML
            private Label studentNum;

            @FXML
            private Label studentNum_Label;

            @FXML
            private ImageView image;

            @FXML
            private Label favActivities;

            @FXML
            private ListView<?> listOfActivities;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Instantiate a new student object
    }
}
