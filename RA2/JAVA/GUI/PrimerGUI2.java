package GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PrimerGUI2 extends Application implements EventHandler<ActionEvent>{
    Button boton;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage ventana) throws Exception{
        ventana.setTitle("mi primer interfaz gráfica con JavaFX");
        boton = new Button();
        boton.setText("Pégame");
        boton.setOnAction(this);

        StackPane lienzo = new StackPane();
        lienzo.getChildren().add(boton);

        Scene Escena = new Scene(lienzo, 600,400);
        ventana.setScene(Escena);

        //Se ejecutar la siguiente línea al final del método
        ventana.show();
    }

    @Override 
    public void handle(ActionEvent event){
        if(event.getSource() == boton)
            System.out.println("Le pegaste al Boton!!!");
    }
}