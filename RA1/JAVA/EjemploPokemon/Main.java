package EjemploPokemon;

import EjemploPokemon.Entrenador;

public class Main {
    public static void main(String[] args){
        Entrenador ash = new Entrenador("Ash", "Pueblo Paleta", "hombre", 11);
        Entrenador misty = new Entrenador("Misty", "Ciudad Celeste", "mujer", 13);
        Entrenador brock = new Entrenador("Brock", "Ciudad Plateada", "hombre", 15);

        ash.completarEquipo();
        System.out.println(ash); // estamos llamando al método toString()

        misty.completarEquipo();
        System.out.println(misty);

        //brock.completarEquipo();
        //System.out.println(brock);

        Combate gimnasioCiudadCeleste = new Combate(ash, misty, "Cascada");
        gimnasioCiudadCeleste.iniciarCombate();

        System.out.println(">>>>>> Luego del Enfrentamiento:");
        System.out.println(ash);
        System.out.println(misty);
    }
}
