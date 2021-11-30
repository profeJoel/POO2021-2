package InnerClass;

public class Ejemplo{
    public static void main(String[] args){
        Exterior  miPosicion = new Exterior("Estoy dando clases");
        Exterior.Coordenada miCoordenada = miPosicion.new Coordenada(0,0);

        System.out.println("Posicion: " + miPosicion.descripcion + " [" + miCoordenada.x + "," + miCoordenada.y + "] ");
    }
}