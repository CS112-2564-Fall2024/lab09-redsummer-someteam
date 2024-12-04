package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.models.HistoricalEvent;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

import javax.swing.text.html.ImageView;

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

    }

    public void initData(Constants.Event eventIndex) {
        String[] data = Constants.HISTORICAL_DATA   [eventIndex.ordinal()];
        RevisedHistoricalEvent event = new RevisedHistoricalEvent(data);
        locationLabel.setText(event.getLocation());
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
