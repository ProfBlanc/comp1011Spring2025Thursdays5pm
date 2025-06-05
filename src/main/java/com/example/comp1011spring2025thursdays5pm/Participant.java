package com.example.comp1011spring2025thursdays5pm;

import javafx.scene.image.Image;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Participant {

    private String nickname;
    private Image avatar;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Image getAvatar() {
        return avatar;
    }

    public void setAvatar(Image avatar) {
        this.avatar = avatar;
    }

    public Participant(String nickname, Image avatar) {
        this.nickname = nickname;
        this.avatar = avatar;
    }
    public static List<String> getAllNicknames(){
        return Arrays.asList("Cool Cat,Smart Cookie,Polite Panther".split(","));
    }
    public static List<String> getAllAvatars(){
        return Stream.of("1", "2", "3").map(s-> "avatar" + s + ".png").toList();
    }

}
