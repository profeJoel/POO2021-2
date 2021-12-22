package Lienzo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.*;
//import javafx.scene.text.*;
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

        Canvas lienzo = new Canvas(1100,800);
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
        //tela.setFont(Font.font("Verdana")); //Incompleto
        tela.setFont(Font.font("Verdana", FontWeight.LIGHT, FontPosture.ITALIC,32.0)); //Resuelto

        //Texto con bordes
        tela.setStroke(Color.BLUE);
        tela.strokeText("Este es otro ejemplo de texto sin relleno", 40, 160);

        //texto con relleno
        tela.setFill(Color.MAGENTA);
        tela.fillText("Este es otro ejemplo de texto con relleno", 40, 200);


        //Agregar figuras geométricas

        //Triángulo /Polígono
        tela.beginPath(); // Marca de inicio para la forma del polígono
        tela.moveTo(40, 260);
        tela.lineTo(400,260);
        tela.lineTo(400,210);
        tela.lineTo(40,260);
        //tela.fill();
        tela.stroke();

        //círculo con bordes y relleno
        tela.strokeOval(260, 30, 100, 100);
        tela.fillOval(370, 30, 100, 100);
        
        //Incluir imágenes
        Image meme = new Image(getClass().getResourceAsStream("dodge.jpg")); //La carga de la imagen en el programa
        //Montar la imagen en la tela
        tela.drawImage(meme, 40, 270); // deja la imagen en el tamaño original
        tela.drawImage(meme, 500, 270, 225,225);// ajusta el tamaño a uno determinado
        tela.drawImage(meme, 50, 10, 225, 255,500, 500, 225,225); // realiza un recorte de la imagen original a un tamaño determinado

        //Dibujo SVG
        tela.setStroke(Color.YELLOW);
        tela.setLineWidth(5.0);

        //Dibujo con solo bordes
        tela.beginPath();
        tela.appendSVGPath("M 876 29 L 846 138 L 732 136 L 827 199 L 789 307 L 879 236 L 970 305 L 930 198 L 1023 133 L 909 138 L 876 29 z");
        tela.closePath();
        tela.stroke();

        
        tela.setFill(Color.YELLOW);
        //Dibujo con solo bordes
        tela.beginPath();
        tela.appendSVGPath("M 876 279 L 846 388 L 732 386 L 827 449 L 789 557 L 879 486 L 970 555 L 930 448 L 1023 383 L 909 388 L 876 279 z");
        tela.closePath();
        tela.fill();

        //Elementos con texturas y degradé

        Stop[] colores = new Stop[] {
            new Stop(0.2, Color.BLACK),
            new Stop(0.5, Color.RED),
            new Stop(0.8, Color.BLACK)
        };
        LinearGradient gradiente = new LinearGradient(0,0,1,0, true, CycleMethod.NO_CYCLE, colores);
        tela.setFill(gradiente);
        tela.fillRect(500, 30, 100, 100);

        
        Stop[] colores2 = new Stop[] {
            new Stop(0, Color.RED),
            new Stop(1, Color.BLACK)
        };
        RadialGradient degrade = new RadialGradient(0,0,0.5,0.5, 0.8, true, CycleMethod.NO_CYCLE, colores2);
        tela.setFill(degrade);
        tela.fillRect(620, 30, 100, 100);

        //Transparencias
        for(int i=1; i<=20; i++){
            float a = i * 0.05f;

            tela.setFill(Color.FORESTGREEN);
            tela.setGlobalAlpha(a); //en esta línea se incluye la transparencia
            tela.fillRect(48 * i, 730, 48, 48);
        }

        Scene tema = new Scene(grupo);
        ventana.setScene(tema);
        ventana.show();
    }

}