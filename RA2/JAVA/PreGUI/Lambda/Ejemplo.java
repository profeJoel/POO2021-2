/** Las Expresiones Lambda son secciones de código resumidas que permiten realizar una funcionalidad específica
* Son equivalente a las funciones, métodos o macros
* variable = parámetros -> expresión;
* x = (a) -> {a*2};
* x(5); // salida: 10
 */

package Lambda;

public class Ejemplo{
    
    public static void main(String[] args){
        //Expresión Lambda para implementar el método de la clase interface SerVivo
        SerVivo perro = (comida) -> ("El perro se come : " + comida);
        imprimirElemento(perro, "hueso");
    }

    public static void imprimirElemento(SerVivo a, String comida){
        String nuevoString = a.come(comida);
        System.out.println("Miren!: " + nuevoString);
    }
}