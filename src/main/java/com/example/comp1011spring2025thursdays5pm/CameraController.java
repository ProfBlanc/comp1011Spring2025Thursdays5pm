package com.example.comp1011spring2025thursdays5pm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CameraController {

    @FXML
    private ComboBox<?> cbCameraList;

    @FXML
    private ComboBox<?> cbMake;

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

    }

    @FXML
    void onSubmitCameraList(ActionEvent event) {

    }

}
