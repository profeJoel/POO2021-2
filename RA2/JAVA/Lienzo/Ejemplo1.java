package Lienzo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.Group;
import javafx.stage.Stage;

public class Ejemplo1 extends Application{
    Stage ventana;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        ventana = primaryStage;
        ventana.setTitle("Lienzo en JavaFX");

        Canvas lienzo = new Canvas(800,800);
        Group grupo = new Group(lienzo);
        GraphicsContext tela = lienzo.getGraphicsContext2D();

        //rectangulo lleno
        tela.fillRect(40,30,100,50);
        tela.fill();

        //rectangulo vacío
        tela.strokeRect(150,30,100,100);
        tela.stroke();

        //texto
        tela.fillText("Hola Chicos, estamos en Canvas", 40, 20);
        tela.setFont(Font.font("Verdana")); //Incompleto

        //Texto con bordes
        tela.setStroke(Color.BLUE);
        tela.strokeText("Este es otro ejemplo de texto sin relleno", 40, 160);
        


        Scene tema = new Scene(grupo);
        ventana.setScene(tema);
        ventana.show();
    }

}