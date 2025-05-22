package com.example.comp1011spring2025thursdays5pm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CameraController {

    @FXML
    private ComboBox<CameraModel> cbCameraList;

    @FXML
    private ComboBox<CameraModel.Companies> cbMake;

    @FXML
    private TextArea output;

    @FXML
    private TextField txtColor;

    @FXML
    private TextField txtIso;

    @FXML
    private TextField txtLens;

    @FXML
    private TextField txtModel;

    @FXML
    private TextField txtResolution;

    @FXML
    void onSubmitCameraForm(ActionEvent event) {

        System.out.println("submitted!");
        System.out.println(txtColor.getText());
        output.setText(txtColor.getText());

        try{
            CameraModel model = new CameraModel();
            model.setModel(txtModel.getText());
            model.setIso(Double.parseDouble(txtIso.getText()));
            model.setLens(txtLens.getText());
            model.setMake(cbMake.getSelectionModel().getSelectedItem());
            model.setResolution(Integer.parseInt(txtResolution.getText()));
            model.setColor(txtColor.getText());

            cbCameraList.getItems().add(model);

        }
        catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("You caused an error");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }

    }

    @FXML
    void onSubmitCameraList(ActionEvent event) {

        /*
                once user presses on the camera submit button
                display the data to the output Node
         */
        int index = cbCameraList.getSelectionModel().getSelectedIndex();
        if(index >= 0){
            System.out.println("user has made a selection");
            CameraModel selected = cbCameraList.getSelectionModel().getSelectedItem();
String details = String.format("Color: %s, Resolution: %d, Make: %s, Iso: %.1f, Model: %s, Lens: %s",
        selected.getColor(), selected.getResolution(), selected.getMake(),
        selected.getIso(), selected.getModel(), selected.getLens()
        );
           // output.setText(cbCameraList.getSelectionModel().getSelectedItem().toString());
            output.setText(details);
        }

    }

    @FXML
    private void initialize(){

        cbMake.getItems().addAll(CameraModel.Companies.values());

        cbMake.getSelectionModel().selectFirst();

    }

}
