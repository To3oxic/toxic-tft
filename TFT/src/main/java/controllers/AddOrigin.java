package controllers;

import constants.ViewConstants;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class AddOrigin {
    Stage stage;
    Scene scene;
    @FXML
    public Button addCombo;
    @FXML
    public Button create;
    @FXML
    public Button back;
    @FXML
    public VBox vBoxCombos;
    @FXML
    public TextField name;
    @FXML
    public void clickAddCombo(){
        try {
            FXMLLoader fxmloader = new FXMLLoader(getClass().getResource(ViewConstants.Pane_Combo));
            Pane pane = fxmloader.load();
            vBoxCombos.getChildren().add(fxmloader.getRoot());
        }catch (Exception e){

        }
    }
    public void setContent(Stage stage, Scene scene) {
        this.scene=scene;
        this.stage=stage;
    }
    @FXML
    public void clickBack(){
        try {
            FXMLLoader fxmloader = new FXMLLoader(getClass().getResource(ViewConstants.Add_View_Fxml));
            Parent parent = fxmloader.load();
            Scene scene = new Scene(parent);
            AddController addController = fxmloader.getController();
            stage.setScene(scene);
            addController.setContent(stage,scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
