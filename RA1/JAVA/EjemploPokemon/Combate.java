package EjemploPokemon;

import javax.lang.model.util.ElementScanner6;

import EjemploPokemon.Entrenador;

public class Combate {
    //atributos
    private int puntos_e1, puntos_e2;
    private Entrenador e1, e2;
    private String nombreMedalla;

    //Métodos
    public Combate(Entrenador e1, Entrenador e2, String nombreMedalla){
        this.puntos_e1 = 0;
        this.puntos_e2 = 0;
        this.e1 = e1;
        this.e2 = e2;
        this.nombreMedalla = nombreMedalla;
    }

    public void iniciarCombate(){
        //Recorrer uno a uno los pokemon de cada entrenador y verificar cual de ellos tiene mayor pc
        for(int i = 0; i<3; i++)
            if(e1.getPokemon(i).getPc() >= e2.getPokemon(i).getPc())
                this.puntos_e1++;
            else
                this.puntos_e2++;

        //verificar el ganador con los turnos dados
        if(this.puntos_e1 >= 2)
        {
            System.out.println("El ganador es: " + e1.getNombre());
            e1.ganaMedalla(this.nombreMedalla);
        }
        else
        {
            System.out.println("El ganador es: " + e2.getNombre());
            e2.ganaMedalla(this.nombreMedalla);
        }

    }
}
