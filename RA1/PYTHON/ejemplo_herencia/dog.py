#from <archivo> import <elemento<class>>
from typing import overload
from animal import Animal

class Dog(Animal):
    def __init__(self, name, ear_type):
        #opcion 1: 
        super().__init__(name)
        #opcion 2: Animal.__init__(name)
        self.ear_type = ear_type

    def make_sound(self):
        print(self.name + " ladra: GUAU...")

    def run(self):
        print(self.name + " Corre")

    
    