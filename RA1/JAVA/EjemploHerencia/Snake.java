package EjemploHerencia;

public class Snake extends Animal{
    private boolean isVenom;

    public Snake(String name, Boolean isVenom){
        super(name);//llamar al constructor de la clase superior, es decir, de clase Animal
        this.isVenom = isVenom;
    }
    
    @Override
    public void makeSound(){
        System.out.println(this.name + " sisea: SSSS!!!");
    }
}
