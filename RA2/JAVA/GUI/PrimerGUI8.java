package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class PrimerGUI8 extends Application{
    Stage ventana;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        ventana = primaryStage;
        ventana.setTitle("mi primer interfaz gráfica con JavaFX");
        
        HBox menu = new HBox();
        Button A = new Button("A");
        Button B = new Button("B");
        Button C = new Button("C");
        menu.getChildren().addAll(A,B,C);

        VBox lateral = new VBox();
        Button D = new Button("D");
        Button E = new Button("E");
        Button F = new Button("F");
        lateral.getChildren().addAll(D,E,F);

        BorderPane panel = new BorderPane();
        panel.setTop(menu);
        panel.setLeft(lateral);

        Scene tema = new Scene(panel, 400,300);
        ventana.setScene(tema);
        //Se ejecutar la siguiente línea al final del método
        ventana.show();
    }

}