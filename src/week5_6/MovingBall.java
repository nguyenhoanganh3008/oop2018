package week5_6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MovingBall<primaryStage> extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
    primaryStage stage = FXMLLoader.load(getClass().getResource("movingBall.fxml"));
    primaryStage.setTitle("movingBall_Javafx");
    Scene scene = new Scene(stage)
    }
}
