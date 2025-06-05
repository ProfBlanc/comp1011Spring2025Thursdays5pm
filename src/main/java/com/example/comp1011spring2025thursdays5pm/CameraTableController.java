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


        TableColumn<CameraModel, String> columnLens = new TableColumn<>("Lens Type");
        columnLens.setCellValueFactory(new PropertyValueFactory<>("lens"));

        TableColumn<CameraModel, String> columnColor = new TableColumn<>("Camera Color");
        columnColor.setCellValueFactory(new PropertyValueFactory<>("color"));

        columnLens.setPrefWidth(150);
        columnColor.setPrefWidth(150);


        tableView.getColumns().add(columnColor);
        tableView.getColumns().add(columnLens);

        tableView.getItems().addAll(CameraModel.populateCameraList());


    }
}
