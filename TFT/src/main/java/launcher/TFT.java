package launcher;

import constants.ViewConstants;
import controllers.MainViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class TFT extends Application {
    private Stage stage;
    private Scene scene;
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("TFT 100% win");
        scene = new Scene(new AnchorPane(), 800, 600);
        this.showMainScreen(primaryStage);
    }

    public void showMainScreen(Stage primaryStage){
        try {
            FXMLLoader fxmloader = new FXMLLoader(getClass().getResource(ViewConstants.Main_View_Fxml));
            Parent parent = fxmloader.load();
            Scene scene = new Scene(parent);
            MainViewController main = fxmloader.getController();
            main.initiate();
            primaryStage.setScene(scene);
            primaryStage.show();
            main.setContent(scene,stage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
