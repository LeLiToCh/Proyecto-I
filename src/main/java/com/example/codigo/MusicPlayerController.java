package com.example.codigo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class MusicPlayerController {
    @FXML
    private Button logoutbutton;
    public void userLogOut(ActionEvent event) throws IOException{

        LogInApplication m = new LogInApplication();
        m.changeScene("loginwindow.fxml");


    }


}
