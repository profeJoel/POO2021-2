package EjemploPokemon;

import java.util.Random;

public class Pokemon{
    //Atributos
    private String nombre;
    private String tipo;
    private int vida;
    private int exp;
    private int pc;
    private int puntosAtaque;
    private int puntosAtaqueCargado;
    private String estado;

    //Métodos
    public Pokemon(String nombre, String tipo, int pc){
        this.nombre = nombre;
        this.tipo = tipo;
        this.pc = pc;

        Random aleatorio = new Random(pc);
        //aleatorio.nextInt(m) + n; -> [n,m-1]
        this.puntosAtaque = aleatorio.nextInt(11) + 10; //nextInt(n) -> [0,n-1]
        this.puntosAtaqueCargado = aleatorio.nextInt(51) + 50;
    }

    public int getPc(){
        return this.pc;
    }

    public String toString(){
        return "\nEl pokemon se llama " + this.nombre + " de tipo " + this.tipo + " con PC " + this.pc + "\n - Ataque Simple = " + this.puntosAtaque + "\n - Ataque Cargado = " + this.puntosAtaqueCargado;
    }   
}