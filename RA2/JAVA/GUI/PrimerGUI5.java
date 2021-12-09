package GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimerGUI5 extends Application{
    Stage ventana;
    Scene tema1, tema2;
    Button boton1, boton2;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        ventana = primaryStage;
        ventana.setTitle("mi primer interfaz gráfica con JavaFX");
        
        Label texto1 = new Label("Bienvenido al primer team de este curso");
        boton1 = new Button("Pasar al Tema 2");

        //La acción para pasar al tema 2 con Expresión Lambda
        boton1.setOnAction(e -> ventana.setScene(tema2));

        /**Sección de elementos de Tema 1 */
        VBox capa1 = new VBox();
        capa1.getChildren().addAll(texto1, boton1);
        tema1 = new Scene(capa1, 600, 300);

        /**Sección de elementos de Tema 2 */
        boton2 = new Button("Volver al primer tema...");
        // La acción de volver al tema 1 con una expresión Lambda
        boton2.setOnAction(e -> ventana.setScene(tema1));
        StackPane capa2 = new StackPane();
        capa2.getChildren().add(boton2);
        tema2 = new Scene(capa2, 600, 300);

        /**Sección de la ventana */
        ventana.setScene(tema1);

        //Se ejecutar la siguiente línea al final del método
        ventana.show();
    }

}