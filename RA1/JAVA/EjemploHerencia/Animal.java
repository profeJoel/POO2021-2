package EjemploHerencia;

public class Animal {
    //Atributos
    protected String name;

    //Métodos
    public Animal(String name){
        super();
        this.name = name;
    }

    public void eat(String something){
        System.out.println(this.name + " come " + something);
    }

    public void makeSound(){
        System.out.println(this.name + " hace un sonido...");
    }

    //getter y setter
    //getter permite obtener información de un atributo, se representa con get<nombreAtributo>
    public String getName(){
        return this.name;
    }

    //setter permite modificar un atributo, se representa con set<nombreAtributo>
    public void setName(String newName){
        if(newName.equals(null) || newName.equals(""))
            System.out.println("Set name is denial...");
        else
            this.name = newName;
    }
}
