package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.EventListener;
import java.util.function.DoubleBinaryOperator;
import java.util.zip.DeflaterOutputStream;

public class Controller {

    @FXML
    private TextField weightTextField;

    @FXML
    private TextField heightTextField;

    @FXML
    private Button calculateButton;

    @FXML
    private ImageView imageView;

    @FXML
    private Label bmiLabel;

    @FXML
    void calculateIsPressed(ActionEvent event) {
        try {
            double w = new Double(weightTextField.getText());
            double h = new Double(heightTextField.getText());
            if(h==0 || w==0){
                invalidInput();
            }
            else{
            Double result = null;
            result = w / Math.pow(h, 2);
            Image img = new Image(photosrc(result));
            imageView.setImage(img);
            bmiLabel.setText(String.format("%.2f", result));}
        } catch (NumberFormatException e) {
            invalidInput();
        }


    }
    private void invalidInput(){
        heightTextField.setText("");
        weightTextField.setText("");
        heightTextField.setPromptText("Try again");
        weightTextField.setPromptText("Try again");
        weightTextField.requestFocus();
    }
    private String photosrc(double result){
        String src = null;
        if (result <= 18.5) {
        src="images/undefweight.gif";
        }

        if (result > 18.5 && result <= 24.9) {
        src="images/normal.gif";
        }

        if (result >= 25 && result <= 29.9) {
        src="images/overweight.gif";
        }

        if (result >= 30) {
        src= "images/obese.gif";
        }
        return src;
    }
}