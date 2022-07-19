package sample;

import javafx.collections.transformation.TransformationList;
import javafx.concurrent.WorkerStateEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.fxml.FXMLLoader.load;

public class Controller {

    @FXML
    private ImageView imageMy1;

    @FXML
    private ImageView imageMy2;

    @FXML
    private ImageView imageMy3;

    @FXML
    private ImageView imageMy4;

    @FXML
    private Button buttonDown;

    @FXML
    private Button buttonReturn;

    @FXML
    void initialize() {
    }
}


