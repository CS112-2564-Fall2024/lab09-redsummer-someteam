package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.models.HistoricalEvent;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CityController {
    @FXML
    Label locationLabel;

    public void initData(Constants.Event eventIndex) {
        String[] data = Historical_DATA[eventIndex.ordinal()];
        RevisedHistoricalEvent event = new RevisedHistoricalEvent(data);
        locationLabel.setText(event.getLocation());
    }
}
