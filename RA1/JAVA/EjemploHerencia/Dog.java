package EjemploHerencia;

public class Dog extends Animal{
    private String earType;

    public Dog(String name, String earType){
        super(name);//llamar al constructor de la clase superior, es decir, de clase Animal
        this.earType = earType;
    }

    @Override
    public void makeSound(){
        System.out.println(this.name + " ladra: Guau!!!");
    }

    
    //Polimorfismo: Sobrecarga
    public void run(){
        System.out.println(this.name + " correr");
    }
}
