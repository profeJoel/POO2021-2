package Calculadora;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Calculadora extends Application{
    Stage ventana;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        ventana = primaryStage;
        ventana.setTitle("Calculadora en JavaFX");

        GridPane panel = new GridPane();
        panel.setPadding(new Insets(10,10,10,10));
        panel.setVgap(4);
        panel.setHgap(2);

        //Variable A
        TextField A = new TextField();
        A.setPromptText("Ingrese el valor de A");
        GridPane.setConstraints(A, 0,0);

        //Variable B
        TextField B = new TextField();
        B.setPromptText("Ingrese el valor de B");
        GridPane.setConstraints(B, 0,1);

        //Respuesta R
        TextField R = new TextField();
        R.setPromptText("Resultado");
        GridPane.setConstraints(R, 0,3);

        //Botones de Operaciones

        Button suma = new Button("+");
        suma.setOnAction(e -> realizarOperacion(A,B,R,'+'));
        GridPane.setConstraints(suma,1,0);
        
        Button resta = new Button("-");
        resta.setOnAction(e -> realizarOperacion(A,B,R,'-'));
        GridPane.setConstraints(resta,1,1);
        
        Button multi = new Button("*");
        multi.setOnAction(e -> realizarOperacion(A,B,R,'*'));
        GridPane.setConstraints(multi,1,2);
        
        Button divi = new Button("/");
        divi.setOnAction(e -> realizarOperacion(A,B,R,'/'));
        GridPane.setConstraints(divi,1,3);

        panel.getChildren().addAll(A,B,R,suma,resta,multi,divi);

        Scene tema = new Scene(panel, 400, 300);
        ventana.setScene(tema);
        ventana.show();
    }

    private void realizarOperacion(TextField textoA, TextField textoB, TextField textoResultado, char operacion){
        if(esEntero(textoA.getText()) && esEntero(textoB.getText())){
            double a = Double.parseDouble(textoA.getText());
            double b = Double.parseDouble(textoB.getText());
            double r = 0;
            String texto;

            try{
                if(operacion == '+') r = a+b;
                if(operacion == '-') r = a-b;
                if(operacion == '*') r = a*b;
                if(operacion == '/') r = (double) a/b;
                texto = String.valueOf(r);
            }
            catch(Exception e){
                texto = "Error en el cálculo";
            }

            textoResultado.setText(texto);
        }
        else
            textoResultado.setText("No se puede realizar la operación...");
    }

    private boolean esEntero(String numero){
        try{
            int valor = Integer.parseInt(numero);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}