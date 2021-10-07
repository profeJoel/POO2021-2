package EjemploHerencia;

public class Cow extends Animal{
    private float hornSize;

    public Cow(String name, float hornSize){
        super(name);//llamar al constructor de la clase superior, es decir, de clase Animal
        this.hornSize = hornSize;
    }
    
    @Override
    public void makeSound(){
        System.out.println(this.name + " brama: Muuu!!!");
    }
}
