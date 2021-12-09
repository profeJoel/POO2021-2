package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PrimerGUI6 extends Application{
    Stage ventana;
    Button boton;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        ventana = primaryStage;
        ventana.setTitle("mi primer interfaz gráfica con JavaFX");

        boton = new Button("Abrir ventana Emergente");
        //Acción para llamar a la ventana emergente
        boton.setOnAction(e -> Emergente.mostrar("Ventana Pop-up","Esta es una Ventana que se muestra por encima de la ventana original"));

        StackPane capa = new StackPane();
        capa.getChildren().add(boton);
        Scene tema = new Scene(capa, 400, 300);
        /**Sección de la ventana */
        ventana.setScene(tema);
        //Se ejecutar la siguiente línea al final del método
        ventana.show();
    }

}