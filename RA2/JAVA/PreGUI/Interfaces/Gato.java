package Interfaces;
public class Gato implements Animal{
    private String nombre;

    public Gato(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void haceRuido(){
        System.out.println(this.nombre + " Maulla...");
    }
    
    @Override
    public void duerme(){
        System.out.println(this.nombre + " está ZZZzzZZZz...");
    }
    
    @Override
    public void seMueve(){
        System.out.println(this.nombre + " se esta Moviendo...");
    }
}