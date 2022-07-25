package sample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private AnchorPane ButtonSalat;

    @FXML
    private ImageView imageMy1;

    @FXML
    private ImageView imageMy2;

    @FXML
    private ImageView imageMy3;

    @FXML
    private Button Button1;

    @FXML
    private Button Button2;

    @FXML
    private Button Button3;


    @FXML
    void initialize(){
        // первая кнопка
        Button1.setOnAction(event -> {
           Parent root;
            try {
               FXMLLoader loader = new FXMLLoader(getClass().getResource("TwoScene.fxml"));

               root = loader.load();
               Stage stage1 = new Stage();

                stage1.setTitle("РЕЦЕПТ САЛАТА ЦЕЗАРЬ");
                stage1.setScene(new Scene(root, 700, 400));
                stage1.show();

           } catch (Exception e){
               e.printStackTrace();
           }
        }
        );

        //Вторая кнопка

        Button2.setOnAction(event -> {
                    Parent root;
                    try {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("SceneBaranina.fxml"));

                        root = loader.load();
                        Stage stage1 = new Stage();

                        stage1.setTitle("РЕЦЕПТ ШАШЛЫКА ИЗ БАРАНИНЫ");
                        stage1.setScene(new Scene(root, 700, 400));
                        stage1.show();

                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
        );

        // третья кнопка

        Button3.setOnAction(event -> {
                    Parent root;
                    try {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("SceneKompot.fxml"));

                        root = loader.load();
                        Stage stage3 = new Stage();


                        stage3.setTitle("РЕЦЕПТ КОМПОТА ИЗ СУХОФРУКТОВ");
                        stage3.setScene(new Scene(root, 700, 400));
                        stage3.show();

                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
        );
    }

}
