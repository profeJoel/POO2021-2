#from <archivo> import <elemento<class>>
from typing import overload
from animal import Animal

class Cat(Animal):
    def __init__(self, name, color):
        #opcion 1: 
        super().__init__(name)
        #opcion 2: Animal.__init__(name)
        self.color = color

    def make_sound(self):
        print(self.name + " hace MIAU...")

    # No se puede realizar polimorfismo paramétrico
    # def make_sound(self, something):
    #    print(self.name + "hace " + something)

    def run(self):
        print(self.name + " Corre")

    
    