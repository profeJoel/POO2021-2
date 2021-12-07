package GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PrimerGUI3 extends Application{
    Button boton;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage ventana) throws Exception{
        ventana.setTitle("mi primer interfaz gráfica con JavaFX");
        boton = new Button();
        boton.setText("Pégame");
        //Inner Class
        boton.setOnAction(
            new EventHandler<ActionEvent>(){
                @Override 
                public void handle(ActionEvent event){
                    System.out.println("Le pegaste al Boton!!!");
                }
            }
        );

        StackPane lienzo = new StackPane();
        lienzo.getChildren().add(boton);

        Scene Escena = new Scene(lienzo, 600,400);
        ventana.setScene(Escena);

        //Se ejecutar la siguiente línea al final del método
        ventana.show();
    }

}