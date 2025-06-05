package com.example.comp1011spring2025thursdays5pm;


import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class CameraTableController {

    @FXML
    private TableView<CameraModel> tableView;


    @FXML
    private void initialize() {


        TableColumn<CameraModel, String> columnLens = new TableColumn<>("Column X");
        columnLens.setCellValueFactory(new PropertyValueFactory<>("lens"));


        TableColumn<CameraModel, String> columnColor = new TableColumn<>("Other Name");
        columnColor.setCellValueFactory(new PropertyValueFactory<>("color"));

        tableView.getColumns().add(columnLens);
        tableView.getColumns().add(columnColor);

        tableView.getItems().addAll(CameraController.populateCameraList());


    }
}
