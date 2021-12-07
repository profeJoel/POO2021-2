package GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PrimerGUI extends Application{

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage ventana) throws Exception{
        ventana.setTitle("mi primer interfaz gráfica con JavaFX");
        Button boton = new Button();
        boton.setText("Pégame");

        StackPane lienzo = new StackPane();
        lienzo.getChildren().add(boton);

        Scene Escena = new Scene(lienzo, 600,400);
        ventana.setScene(Escena);

        //Se ejecutar la siguiente línea al final del método
        ventana.show();
    }
}