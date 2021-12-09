package GUI;

//* significa que importa todo lo que contiene el paquete indicado
import javafx.stage.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class Confirmacion{
    static boolean respuesta;

    public static boolean mostrar(String titulo, String mensaje){
        Stage ventana = new Stage();
        //Indicar que la ventana es emergente
        ventana.initModality(Modality.APPLICATION_MODAL);
        ventana.setTitle(titulo);
        ventana.setMinWidth(250);

        Label texto = new Label(mensaje);


        Button si = new Button("Si");
        Button no = new Button("No");

        //Acciones para confirmar o Denegar
        si.setOnAction(e -> {
            respuesta = true;
            ventana.close();
        });
        no.setOnAction(e -> {
            respuesta = false;
            ventana.close();
        });

        VBox capa = new VBox();
        capa.getChildren().addAll(texto,si,no);
        capa.setAlignment(Pos.CENTER);

        Scene tema = new Scene(capa);
        ventana.setScene(tema);
        ventana.showAndWait();

        return respuesta;
    }
}