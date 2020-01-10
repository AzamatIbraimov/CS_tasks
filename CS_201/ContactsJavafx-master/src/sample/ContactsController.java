package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Callback;

import java.awt.print.Book;
import java.text.Collator;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class ContactsController {

    @FXML
    private ListView<ContactsInfo> ContactsListView;

    @FXML
    private ImageView PhotoImageView;

    @FXML
    private TextField NameTextField;

    @FXML
    private TextField SurnameTextField;

    @FXML
    private TextField EmailTextField;

    @FXML
    private TextField PhoneNumberTextField;

    @FXML
    private TextField AgeTextField;

    private final ObservableList<ContactsInfo> contacts = FXCollections.observableArrayList();


    public void initialize() {
        contacts.add(new ContactsInfo("Steven", "Gerrard",40,
                "sample/avatars/Stevie.img", "YNWA@gmail.com",
                "+996222125601"));
        contacts.add(new ContactsInfo("Billie", "Eilish",19,
                "sample/avatars/Billie.img", "baaadguy@gmail.com",
                "+996555473104"));
        contacts.add(new ContactsInfo("James", "Blunt",42,
                "sample/avatars/James.img", "youarebeautiful@gmail.com",
                "+996500431476"));
        contacts.add(new ContactsInfo("Jimmy", "Carr",50,
                "sample/avatars/Jimmy.img", "lotoflaugh@gmail.com",
                "+996222125601"));



        ContactsListView.setItems(contacts.sorted());

        ContactsListView.getSelectionModel().selectedItemProperty().
                addListener(
                        new ChangeListener<ContactsInfo>() {
                            @Override
                            public void changed(ObservableValue<? extends ContactsInfo> observable, ContactsInfo oldValue, ContactsInfo newValue) {
                                PhotoImageView.setImage(
                                        new Image(newValue.getPhoto())
                                );
                                NameTextField.setText(newValue.getName());
                                SurnameTextField.setText(newValue.getSurname());
                                EmailTextField.setText(newValue.getEmail());
                                PhoneNumberTextField.setText(newValue.getPhoneNumber());
                                AgeTextField.setText(String.valueOf(newValue.getAge()));
                            }
                        }
                );

        ContactsListView.setCellFactory(
                new Callback<ListView<ContactsInfo>, ListCell<ContactsInfo>>() {
                    @Override
                    public ListCell<ContactsInfo> call(ListView<ContactsInfo> listView) {
                        return new ImageTextCell();
                    }
                }
        );
    }

}