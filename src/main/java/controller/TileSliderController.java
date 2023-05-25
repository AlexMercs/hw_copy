package controller;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import model.TileSliderModel;
import java.util.ArrayList;


public class TileSliderController  {
    @FXML
    private GridPane myGridPane;

    private ArrayList<Square> squares = new ArrayList<>();
    public void initialize(){
        for(int i = 0; i < myGridPane.getChildren().size(); i++){
            if (myGridPane.getChildren().get(i) instanceof StackPane){
                Square square;
                square = new Square((StackPane) myGridPane.getChildren().get(i));
                squares.add(square);
            }
        }
    }

    private class Square {
        private StackPane stackPane;
        public Square(StackPane stackPane) {
            this.stackPane = stackPane;
        }
        public StackPane getStackPane() {
            return stackPane;
        }
    }

    private TileSliderModel model = new TileSliderModel();

}