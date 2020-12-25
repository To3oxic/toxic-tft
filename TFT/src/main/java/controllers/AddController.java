package controllers;

import constants.ViewConstants;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class AddController {
    Stage stage;
    Scene scene;
    @FXML
    public Button addChamp;
    @FXML
    public Button addItem;
    @FXML
    public Button back;

    public void setContent(Stage stage,Scene scene){
        this.stage=stage;
        this.scene=scene;
    }
    @FXML
    public void clickBack(){
        try {
            FXMLLoader fxmloader = new FXMLLoader(getClass().getResource(ViewConstants.Main_View_Fxml));
            Parent parent = fxmloader.load();
            Scene scene = new Scene(parent);
            MainViewController main = fxmloader.getController();
            stage.setScene(scene);
            main.setContent(scene,stage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void clickItem(){

    }
    @FXML
    public void clickChamp(){
        try {
            FXMLLoader fxmloader = new FXMLLoader(getClass().getResource(ViewConstants.Add_Champ_View_Fxml));
            Parent parent = fxmloader.load();
            Scene scene = new Scene(parent);
            AddChampController addChampController = fxmloader.getController();
            stage.setScene(scene);
            addChampController.setContent(stage,scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void clickClass(){
        try {
            FXMLLoader fxmloader = new FXMLLoader(getClass().getResource(ViewConstants.Add_Class_View_Fxml));
            Parent parent = fxmloader.load();
            Scene scene = new Scene(parent);
            AddClass addClassController = fxmloader.getController();
            stage.setScene(scene);
            addClassController.setContent(stage,scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void clickOrigin(){
        try {
            FXMLLoader fxmloader = new FXMLLoader(getClass().getResource(ViewConstants.Add_Origin_View_Fxml));
            Parent parent = fxmloader.load();
            Scene scene = new Scene(parent);
            AddOrigin addClassController = fxmloader.getController();
            stage.setScene(scene);
            addClassController.setContent(stage,scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
