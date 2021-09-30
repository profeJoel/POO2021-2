package EjemploGatos;

public class EjemploGatos{
    public static void main(String[] args){
        //Gato tom = new Gato();
        //System.out.println("El nombre del gato es " + tom.name);
        Gato oscar = new Gato("Óscar", "macho", 3, 7, "marrón", "rayado");
        //System.out.println("El nombre del gato oscar es " + oscar.name);
        System.out.println("Gato oscar es " + oscar.darInformacion());
        
        Gato luna = new Gato("Luna", "hembra", 2, 5, "gris", "lisa");
        //System.out.println("El nombre del gato luna es " + luna.name);
        System.out.println("Gata luna es " + luna.darInformacion());

        //oscar.age = 0;
        oscar.addAge();
        //oscar.color = "Verde";
        oscar.changeColor("Verde");
        System.out.println("Gato oscar es " + oscar.darInformacion());

    }
}