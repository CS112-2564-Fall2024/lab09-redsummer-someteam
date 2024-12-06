package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.models.HistoricalEvent;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import static cs112.lab09.Constants.HISTORICAL_DATA;

public class CityController {
    @FXML
    Label locationLabel;
    @FXML
    Label dateLabel;
    @FXML
    Label descriptionLabel;
    @FXML
    Label revisedDescriptionLabel;
    @FXML
    ImageView imageView;
    @FXML
    Hyperlink hyperLinkReference;

    public void closeButton() {
        Stage stage = (Stage)imageView.getScene().getWindow();
        stage.close();
    }

    public void initData(Constants.Event eventIndex) {
        String[] data = Constants.HISTORICAL_DATA   [eventIndex.ordinal()];
        RevisedHistoricalEvent event = new RevisedHistoricalEvent(data);
        imageView.setImage(event.getImage());
        locationLabel.setText(event.getLocation());
        dateLabel.setText(event.getEventDay().toString());
        descriptionLabel.setText(event.getDescription());
        revisedDescriptionLabel.setText(event.getRevisedDescription());
        // hyperLinkReference.setText(event.getCitation());
    }

//    public void setBisbee(String bee) {
//        // bee object
//        System.out.println(bee);
//    }
//
//    public void setSanFrancisco(String fran) {
//        // fran object
//        System.out.println(fran);
//    }
}
