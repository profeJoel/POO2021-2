from animal import Animal
from cat import Cat
from dog import Dog
from cow import Cow
from snake import Snake

if __name__ == "__main__":
    horse = Animal("Spirit")

    horse.eat("grass")
    horse.make_sound()

    garfield = Cat("Garfield", "Orange")

    garfield.eat("Lassagna")
    garfield.make_sound()
    #garfield.make_sound("Hola Bonachón") # No se puede hacer poliformismo paramétrico

    chocolo = Dog("Chocolo", "fall")

    chocolo.eat("MasterDog")
    chocolo.make_sound()

    lola = Cow("Lola", 10)

    lola.eat("grass")
    lola.make_sound()

    nagini = Snake("Nagini", False)

    nagini.eat("people")
    nagini.make_sound()

    garfield.run()
    chocolo.run()