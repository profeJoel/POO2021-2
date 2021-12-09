package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.stage.Stage;

public class PrimerGUI9 extends Application{
    Stage ventana;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        ventana = primaryStage;
        ventana.setTitle("mi primer interfaz gráfica con JavaFX");
        
        GridPane panel = new GridPane();
        panel.setPadding(new Insets(10,10,10,10));
        panel.setVgap(4);//4 filas
        panel.setHgap(2);//2 columnas

        Label titulo = new Label("Bienvenido a la Interfaz de Usuario!!!");
        GridPane.setConstraints(titulo, 0,0);

        //Elementos para los datos del usuario

        Label textoUsuario = new Label("Nombre Usuario: ");
        GridPane.setConstraints(textoUsuario, 0, 1);
        TextField entradaUsuario = new TextField("Nombre Usuario");
        GridPane.setConstraints(entradaUsuario, 1,1);

        Label textoPassword = new Label("Password Usuario: ");
        GridPane.setConstraints(textoPassword, 0, 2);
        //TextField entradaPassword = new TextField("password");
        PasswordField entradaPassword = new PasswordField();
        entradaPassword.setPromptText("password");
        GridPane.setConstraints(entradaPassword, 1,2);

        Button boton = new Button("Ingresar");
        boton.setOnAction(e -> {
            System.out.println("> Usuario es: " + entradaUsuario.getText() + " > pwd: " + entradaPassword.getText());
        });
        GridPane.setConstraints(boton, 1, 3);


        panel.getChildren().addAll(titulo, textoUsuario, entradaUsuario, textoPassword, entradaPassword, boton);
        
        Scene tema = new Scene(panel, 400,300);
        ventana.setScene(tema);
        //Se ejecutar la siguiente línea al final del método
        ventana.show();
    }

}