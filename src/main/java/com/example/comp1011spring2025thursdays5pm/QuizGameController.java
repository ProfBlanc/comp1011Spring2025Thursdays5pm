package com.example.comp1011spring2025thursdays5pm;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.List;

public class QuizGameController {

    @FXML
    private Button btnSubmit;

    @FXML
    private ComboBox<String> cbNickname;

    @FXML
    private ImageView imgAvatar;

    @FXML
    private Spinner<Integer> imgSpinner;

    private List<Image> images;


    @FXML
    private void initialize() {
        cbNickname.getItems().addAll(Participant.getAllNicknames());
        cbNickname.getSelectionModel().selectFirst();

        images = Participant.getAllAvatars().stream()
                .map( v -> new Image(getClass().getResourceAsStream("images/avatars/" + v))   )
                        .toList();

        //set the values of spinner
        imgSpinner.setValueFactory(
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, images.size() - 1, 0)
        );


        //set the behaviour of spinner (what happens when user chooses option0)
        imgSpinner.valueProperty().addListener(
    (observable, oldValue, newValue) -> imgAvatar.setImage(images.get(newValue))  );


    btnSubmit.setOnAction(e->{

        Participant participant = new Participant(cbNickname.getValue(), imgAvatar.getImage());

        try{
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("quiz-game-questions-view.fxml"));
            //instantiate a controller
            QuizQuestionsController controller = new QuizQuestionsController();
            //pass desired data
            controller.setParticipant(participant);
            //attach the controller to the fxmlLoader
            fxmlLoader.setController(controller);
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Quiz Time!");
            stage.setScene(scene);
            stage.show();

        }
        catch(Exception ex){
            System.err.println(ex.getMessage());
        }

    });


    }
}
