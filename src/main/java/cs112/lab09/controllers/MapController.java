package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import static cs112.lab09.Constants.*;

public class MapController {
    @FXML
    ImageView imageView;

    public void initData(Constants.Event eventIndex) {
        Image image = new Image(REDSUMMER_IMAGE_PATH);
        imageView.setImage(image);
    }

    public void sanFranciscoCaBtn() throws IOException {
        sanFranciscoCaBtn(Event.SAN_FRANCISCO);
    }
    public void bisbeeAzBtn() throws IOException {
        bisbeeAzBtn(Event.BISBEE);
    }

    public void sanFranciscoCaBtn (Constants.Event eventIndex) throws IOException {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);

        FXMLLoader fxmlLoader = new FXMLLoader(RedSummer.class.getResource(CITY_VIEW_RESOURCE));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle(CITY_VIEW_TITLE);
        CityController cityController = fxmlLoader.getController();
        cityController.initData(eventIndex);
        stage.show();
    }
    public void bisbeeAzBtn (Constants.Event eventIndex) throws IOException {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);

        FXMLLoader fxmlLoader = new FXMLLoader(RedSummer.class.getResource(CITY_VIEW_RESOURCE));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle(CITY_VIEW_TITLE);
        CityController cityController = fxmlLoader.getController();
        cityController.initData(eventIndex);
        stage.show();
    }
}
