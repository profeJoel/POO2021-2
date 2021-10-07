package EjemploHerencia;

public class EjemploHerencia {
    public static void main(String[] args){

        Animal horse = new Animal("Spirit");

        horse.eat("apples");
        horse.makeSound();

        Cat garfield = new Cat("Garfield", "Orange");

        garfield.eat("Lassagna");
        garfield.makeSound();
        garfield.makeSound("Hola Bonachón");

        Dog chocolo = new Dog("Chocolo", "fall");

        chocolo.eat("MasterDog");
        chocolo.makeSound();

        Cow lola = new Cow("Lola", 10);

        lola.eat("grass");
        lola.makeSound();

        Snake nagini = new Snake("Nagini", false);

        nagini.eat("people");
        nagini.makeSound();

        garfield.run();
        chocolo.run();
    }
}
