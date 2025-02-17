package com.example;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class SolutionController {

    @FXML
    private TableColumn<Henger, Integer> idCol;

    @FXML
    private TableColumn<Henger, Double> lengthCol;

    @FXML
    private TableColumn<Henger, Double> radiusCol;

    @FXML
    private TableColumn<Henger, Double> surfaceCol;

    @FXML
    private TableView<Henger> table;

    ArrayList<Henger> hengerList;

    Henger henger;

    @FXML
    void onClickBackButton(ActionEvent event) {
        App.setRoot("mainScene");
    }

    @FXML
    void onMouseClickedTable(MouseEvent event) {
        this.henger = this.table.getSelectionModel().getSelectedItem();
    }

    @FXML
    void initialize() {
        System.out.println("Running...");
        Handler handler = new Handler();
        hengerList = handler.readFile();
        this.initTable();
    }

    void initTable() {
        this.idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.radiusCol.setCellValueFactory(new PropertyValueFactory<>("radius"));
        this.lengthCol.setCellValueFactory(new PropertyValueFactory<>("length"));
        this.surfaceCol.setCellValueFactory(new PropertyValueFactory<>("surface"));

        ObservableList<Henger> hengerek = 
            FXCollections.observableArrayList(hengerList);
        this.table.getItems().addAll(hengerek);
    }

}