package com.example.f21comp1011gcfinalb;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class InventoryPriceController implements Initializable {

    @FXML
    private Label numOfCarsLabel;

    @FXML
    private Label avgPriceLabel;

    @FXML
    private ListView<PriceRange> priceListView;

    @FXML
    private ListView<Car> carListView;

    @FXML
    private RadioButton yearRadioButton;

    @FXML
    private RadioButton priceRadioButton;

    @FXML
    private Label headerLabel;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        ArrayList<PriceRange> priceRanges = new ArrayList<>();

        for (int i=0; i<=360000;i+=20000){
            PriceRange priceRange = new PriceRange(i, i+20000-1);
            priceRanges.add(priceRange);
        }

        Dealership dealership = Utility.getDealershipDataFromJson();
        headerLabel.setText("Dealership: " + dealership.getDealer());
    }

}
