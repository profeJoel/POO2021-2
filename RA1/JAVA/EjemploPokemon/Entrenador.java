package EjemploPokemon;

import java.util.Scanner;

public class Entrenador {
    // Atributos
    private String nombre;
    private String origen;
    private String genero;
    private int edad;
    private String[] medalla;
    private int nivel;
    private Pokemon[] equipo;
    private int cantPokemon;
    private int cantMedallas;

    // Métodos
    public Entrenador(String nombre, String origen, String genero, int edad){
        this.nombre = nombre;
        this.origen = origen;
        this.genero = genero;
        this.edad = edad;
        this.equipo = new Pokemon[3]; // está asignando 3 espacio de tipo Pokemon
        this.medalla = new String[8];
        this.cantPokemon = 0;
        this.cantMedallas = 0;
    }

    //getter -> obtener informacion
    public Pokemon getPokemon(int indice){
        return this.equipo[indice];
    }

    public String getNombre(){
        return this.nombre;
    }

    public void capturarPokemon(){
        Scanner lector = new Scanner(System.in);
        String nombre, tipo;
        int pc;

        //Asegura que no se agregarán más de 3 pokemon al array
        if(this.cantPokemon >= 0){
            System.out.println("Ingrese el nombre del pokemon: ");
            nombre = lector.next();
            System.out.println("Ingrese el tipo del pokemon: ");
            tipo = lector.next();
            System.out.println("Ingrese el PC del Pokemon: ");
            pc = lector.nextInt();

            Pokemon nuevoPokemon = new Pokemon(nombre, tipo, pc);
            //Asignación al array
            this.equipo[this.cantPokemon] = nuevoPokemon; // nuevoPokemon está dentro del array equipo
            this.cantPokemon++;

            //Asegurarnos de que no se exceda el límite
            if(this.cantPokemon == 3)
                this.cantPokemon = -1; // es una bandera para que no se agreguen pokemon
        }
    }

    public void completarEquipo(){
        for(int i=0; i<3; i++)
            this.capturarPokemon();
    }

    public void ganaMedalla(String nombreMedalla){
        this.medalla[this.cantMedallas] = nombreMedalla;
        this.cantMedallas++;
    }

    public String toString(){
        return "\nEntrenador " + this.nombre + " de " + this.origen + " con " + this.cantMedallas + " medallas y un equipo pokemon de: \n * " + this.equipo[0] + "\n * " + this.equipo[1] + "\n * " + this.equipo[2];
    }


}
