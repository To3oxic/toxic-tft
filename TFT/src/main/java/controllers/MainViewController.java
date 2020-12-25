package controllers;

import constants.ViewConstants;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.Champion;
import model.Origin;

import java.io.IOException;
import java.util.ArrayList;

public class MainViewController {
    ArrayList<Champion> champions=new ArrayList<Champion>();
    ArrayList<Origin>origins=new ArrayList<Origin>();
    ArrayList<Class>classes=new ArrayList<Class>();

    private Stage stage;
    private Scene scene;
    @FXML
    public Button start;
    @FXML
    public Button edit;
    @FXML
    public Button Add;

    public void setContent(Scene scene,Stage stage){
        this.scene=scene;
        this.stage=stage;
    }
    public void buildChamps(){

    }
    public void buildOrigins(){

    }
    public void buildClasses(){

    }
    @FXML
    public void clickStart(){

    }
    @FXML
    public void clickEdit(){

    }
    @FXML
    public void clickAdd(){
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

    public void initiate() {
        buildChamps();
        buildClasses();
        buildOrigins();
    }
}
