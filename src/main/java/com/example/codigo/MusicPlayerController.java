package com.example.codigo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class MusicPlayerController {
    private String [] songs;
    private int [] favoriteSongs;
    private boolean pause;
    private int reproducedSong;
    @FXML //instanciamos cada uno de los atributos de nuestro fxml
    private Button logoutbutton;

    public void reproductor(String[] songs) {
        this.songs = songs;
        this.favoriteSongs = new int[songs.length];
        for(int i = 0; i < songs.length; i++){
            this.favoriteSongs[i] = -1;
        }
        this.pause = true;
        this.reproducedSong = 0;
    }
    public void nextSong() {
        if (this.reproducedSong >= 0 && this.reproducedSong < (this.songs.length - 1)) { //Revisa que se encuentre en una posicion dentro del rango de la lista de canciones
            this.reproducedSong = this.reproducedSong + 1; //Pasa a la siguiente cancion
        } else if (this.reproducedSong >= this.songs.length - 1) { //Revisa si el indice de las canciones es mayor al permitido
            this.reproducedSong = (this.reproducedSong + 1) % this.songs.length; //Hace que salte al inicio de la lista
        }
    }
    public void previousSong() {
        if(this.reproducedSong == 0){ //Revisa que las canciones se encuentren en el rango de reproduccion
            this.reproducedSong = (this.reproducedSong + this.songs.length - 1) % this.songs.length; //Da un salto a la ultima cancion
        } else {
            this.reproducedSong = this.reproducedSong - 1; //Se devuelve una cancion
        }
    }
    public void changeMusicPlayerState(){
        this.pause =! this.pause; //Cambia al valor contrario
    }

    public void addSongs_to_Favorite() {
        for (int i = 0; i < favoriteSongs.length; i++) { //Si la cancion favorita se esta reproduciondo da return
            if(favoriteSongs[i] == -1) { //Si es -1 la cancion no está agregada
                favoriteSongs[i] = reproducedSong; //Agrega la cancion a favoritas
                return;
            }
        }
    }

    //Se establecen metodos Geters y Seters
    public String[] getCanciones() {
        return songs;
    }

    public void setCanciones(String[] canciones) {
        this.songs = canciones;
    }

    public int[] getCancionesFavoritas() {
        return favoriteSongs;
    }

    public void setCancionesFavoritas(int[] cancionesFavoritas) {
        this.favoriteSongs = cancionesFavoritas;
    }

    public boolean isPausado() {
        return pause;
    }

    public void setPausado(boolean pausa) {
        this.pause = pausa;
    }

    public int getCancionReproducida() {
        return reproducedSong;
    }

    public void setCancionReproducida(int cancionReproducida) {
        this.reproducedSong = cancionReproducida;
    }

    public void userLogOut(ActionEvent event) throws IOException{ // funcion log out hace lo mismo que change scene, solo que aqui cambia la escena a la primera (la del log in)

        LogInApplication m = new LogInApplication();
        m.changeScene("loginwindow.fxml");


    }


}
