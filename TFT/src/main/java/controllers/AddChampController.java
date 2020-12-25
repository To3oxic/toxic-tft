package controllers;

import constants.ViewConstants;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddChampController {
    Stage stage;
    Scene scene;
    @FXML
    public Button iconBrowseButton;
    @FXML
    public Button back;
    @FXML
    public Button create;
    @FXML
    public ComboBox<String> class1;
    @FXML
    public ComboBox<String> origin1;
    @FXML
    public ComboBox<String> class2;
    @FXML
    public ComboBox<String> origin2;
    @FXML
    public TextField nameField;
    @FXML
    public TextField iconTextFeld;

    public void setContent(Stage stage, Scene scene){
        this.stage=stage;
        this.scene=scene;
    }
    @FXML
    public void clickCreate(){

    }
    @FXML
    public void clickBack(){
        try {
            FXMLLoader fxmloader = new FXMLLoader(getClass().getResource(ViewConstants.Add_View_Fxml));
            Parent parent = fxmloader.load();
            Scene scene = new Scene(parent);
            AddController addController = fxmloader.getController();
            stage.setScene(scene);
            stage.show();
            addController.setContent(stage,scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
