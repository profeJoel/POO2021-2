package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class PrimerGUI7 extends Application{
    static boolean resultado;
    Stage ventana;
    Button boton;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        ventana = primaryStage;
        ventana.setTitle("mi primer interfaz gráfica con JavaFX");

        boton = new Button("Abrir ventana de Confirmación");
        Label texto = new Label("");
        //Acción para llamar a la ventana emergente
        boton.setOnAction(e -> {
            resultado = Confirmacion.mostrar("Ventana Pop-up", "Terminamos la Clase?");
            /**if(resultado)
                texto.setText("Si, terminamos la Clase!!!");
            else
                texto.setText("No, sigamos con la clase!!!");*/
            // (consulta)? (el codigo para la parte afirmativa) : (el codigo para la parte negativa);
            texto.setText((resultado)? "Si, terminamos la Clase!!!" : "No, seguimos con la Clase!!!");
        });

        VBox capa = new VBox();
        capa.getChildren().addAll(boton,texto);
        capa.setAlignment(Pos.CENTER);
        Scene tema = new Scene(capa, 400, 300);
        /**Sección de la ventana */
        ventana.setScene(tema);
        //Se ejecutar la siguiente línea al final del método
        ventana.show();
    }

}