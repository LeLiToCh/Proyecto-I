package com.example.codigo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class MusicPlayerController {
    @FXML //instanciamos cada uno de los atributos de nuestro fxml
    private Button logoutbutton;
    public void userLogOut(ActionEvent event) throws IOException{ // funcion log out hace lo mismo que change scene, solo que aqui cambia la escena a la primera (la del log in)

        LogInApplication m = new LogInApplication();
        m.changeScene("loginwindow.fxml");


    }


}
