package com.example.f21comp1011gcfinalb;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

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
        ArrayList<Car> car = dealership.getStock();
        headerLabel.setText("Dealership: " + dealership.getDealer());

        carListView.getItems().addAll(car);
        numOfCarsLabel.setText(String.valueOf(carListView.getItems().stream().count()));
        ToggleGroup group = new ToggleGroup();
        yearRadioButton.setToggleGroup(group);
        priceRadioButton.setToggleGroup(group);

        priceListView.getItems().addAll(priceRanges);


        priceListView.getSelectionModel().selectedItemProperty().addListener((obd, old, selectedRange)-> {

            if(selectedRange != null){
               // carListView.getItems().addcar);
                ArrayList<Car> newList = new ArrayList<>();
                for(int i=0; i<car.size();i++)
                {
                    if (selectedRange.getMinPrice() >= car.get(i).getPrice() ||selectedRange.getMaxPrice() <= car.get(i).getPrice()){
                       newList.add(car.get(i));
                       System.out.println(newList);
                    }
                }
                carListView.getItems().clear();
                carListView.getItems().addAll(newList);
                numOfCarsLabel.setText(String.valueOf(carListView.getItems().stream().count()));
                }


    });}

}
