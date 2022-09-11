package com.example.codigo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LogInController extends LogInApplication{


    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Label IncorrectLogIn;
    @FXML
    private Button button;
    public void userLogIn(ActionEvent event) throws IOException, InterruptedException {
        clickLogin();
    }
    @FXML
    private void clickLogin() throws IOException, InterruptedException {
        LogInApplication m = new LogInApplication();
        if (username.getText().toString().equals("Elduro") && password.getText().toString().equals("69420")){
            TimeUnit.SECONDS.sleep(1);
            m.changeScene("2ndwindowmplayer.fxml");

        }
        if (username.getText().toString().equals("QuitoEsteban69") && password.getText().toString().equals("222")) {
            TimeUnit.SECONDS.sleep(1);
            m.changeScene("2ndwindowmplayer.fxml");
        }
        if (username.getText().toString().equals("Emmanuel") && password.getText().toString().equals("310757")) {
            TimeUnit.SECONDS.sleep(1);
            m.changeScene("2ndwindowmplayer.fxml");
        }
        if(username.getText().isEmpty() && password.getText().isEmpty()){

            IncorrectLogIn.setText("Please type your username & password");

        }
        else {
            IncorrectLogIn.setText("Wrong username or password");

        }


    }

}