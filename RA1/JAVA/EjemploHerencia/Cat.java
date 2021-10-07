package EjemploHerencia;

//la herencia se declara añadiendo la palabra "extends" de otra clase
// public class <subclass> extends <superclass>
public class Cat extends Animal{
    private String color;

    public Cat(String name, String color){
        super(name);//llamar al constructor de la clase superior, es decir, de clase Animal
        this.color = color;
    }

    //Polimorfismo: Inclusión
    @Override
    public void makeSound(){
        System.out.println(this.name + " maulla: Miau!!!");
    }

    //Polimorfismo: Paramétrico
    public void makeSound(String something){
        System.out.println(this.name + " maulla: " + something);
    }

    //Polimorfismo: Sobrecarga
    public void run(){
        System.out.println(this.name + " correr");
    }
}
