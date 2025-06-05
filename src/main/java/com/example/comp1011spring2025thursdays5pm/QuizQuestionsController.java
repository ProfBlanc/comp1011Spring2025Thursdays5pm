package com.example.comp1011spring2025thursdays5pm;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;

public class QuizQuestionsController {

    @FXML
    private Button btnSubmit;

    @FXML
    private ImageView imgAvatar;

    @FXML
    private RadioButton rbOption1, rbOption2, rbOption3, rbOption4;

    @FXML
    private Label txtCorrectAnswers, txtNickname, txtQuestion, txtQuestionsRemaining, txtTotalQuestions;

    private Participant participant;

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    @FXML
    private void initialize() {
        txtNickname.setText(participant.getNickname());
        imgAvatar.setImage(participant.getAvatar());
    }
}




