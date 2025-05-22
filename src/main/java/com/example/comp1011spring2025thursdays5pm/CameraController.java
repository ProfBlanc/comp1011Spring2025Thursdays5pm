package com.example.comp1011spring2025thursdays5pm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;

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
    private TextField txtSearch;

    @FXML
    private Button btnSearch;

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

//        if(1 < 0)
//            System.out.println("1 is less than zero");

        btnSearch.setOnAction(
                 e->{
                     String searchText = txtSearch.getText().toLowerCase();
                     cbCameraList.getItems().stream()
                             .filter(v -> v.getLens().toLowerCase().contains(searchText) ||
                                     v.getColor().toLowerCase().contains(searchText) ||
                                             v.getModel().toLowerCase().contains(searchText) ||
                                             v.getMake().toString().toLowerCase().contains(searchText) ||
                                             String.valueOf(v.getIso()).contains(searchText) ||
                                             String.valueOf(v.getResolution()).contains(searchText)
                                     )
                             .forEach(v -> output.setText(output.getText() + '\n' + v));
                 }
        );

        cbMake.getItems().addAll(CameraModel.Companies.values());
        cbMake.getSelectionModel().selectFirst();
        cbCameraList.getItems().addAll(populateCameraList());

    }
    private List<CameraModel> populateCameraList(){
        List<CameraModel> list = new ArrayList<>();
        //String lens, String color, double iso, int resolution, String model, Companies make
list.add(new CameraModel("lens", "black", 100, 1080, "Model", CameraModel.Companies.NIKON));
list.add(new CameraModel("cool", "red", 200, 2080, "Horse", CameraModel.Companies.CANON));
list.add(new CameraModel("beans", "black", 100, 3080, "Buggy", CameraModel.Companies.FUJIFILM));
    return list;
    }

}
