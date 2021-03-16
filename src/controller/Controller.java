package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.image.ImageView;
import model.Student;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

            private final List<String> ListOfActivities = new ArrayList<>(Arrays.asList("Dancing", "Running", "Golfing", "Skydiving", "Surfing", "Traveling"));

            private void updateLabels(Student updatedStudentCard) {
                firstName.setText(updatedStudentCard.getFirstName());
            }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Instantiate a new student object
        Student newStudentCard = new Student("Branden", "Yoshaev", "Golfing", 2002028, "/image/Branden Picture.png");
        updateLabels(newStudentCard);
    }
}
