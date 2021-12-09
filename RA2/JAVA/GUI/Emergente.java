package GUI;

//* significa que importa todo lo que contiene el paquete indicado
import javafx.stage.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class Emergente{
    public static void mostrar(String titulo, String mensaje){
        Stage ventana = new Stage();
        //Indicar que la ventana es emergente
        ventana.initModality(Modality.APPLICATION_MODAL);
        ventana.setTitle(titulo);
        ventana.setMinWidth(250);

        Label texto = new Label(mensaje);
        Button botonCierre = new Button("Cerrar");
        botonCierre.setOnAction(e -> ventana.close());

        VBox capa = new VBox();
        capa.getChildren().addAll(texto,botonCierre);
        capa.setAlignment(Pos.CENTER);

        Scene tema = new Scene(capa);
        ventana.setScene(tema);
        ventana.showAndWait();
    }
}