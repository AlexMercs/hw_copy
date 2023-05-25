package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TileSliderApplication extends Application {
    /*
    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(TileSliderApplication.class.getResource("/fxml/TileSlider.fxml"));
        stage.setTitle("TileSlider");
        Scene scene = (new Scene(root));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    */

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/TileSlider.fxml"));
        Parent root = fxmlLoader.load();
        stage.setTitle("Board Game");
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.show();
    }
}
