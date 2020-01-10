package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    private TextField MHRfield;

    @FXML
    private Button calculate;

    @FXML
    private TextField THRfield;

    @FXML
    private Label errorlabel;


    @FXML
    private TextField ageInput;

    @FXML
    void calculateButtonPressed(ActionEvent event) {
        try{
            int age = Integer.parseInt(ageInput.getText());
            int maxrate = 220-age;
            if (age <= 0 ){
                tryAgain();
            }
            else{
                errorlabel.setText("");
                MHRfield.setText(String.valueOf(maxrate));
                THRfield.setText(String.valueOf(Math.round(maxrate*0.5))+"-"+String.valueOf(Math.round(maxrate*0.85))+" bpm");
            }
        }
        catch (NumberFormatException e)
        {
            tryAgain();
        }
    }
    private void tryAgain(){
        errorlabel.setText("Try again!");
    }

}
