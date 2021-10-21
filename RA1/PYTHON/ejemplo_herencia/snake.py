#from <archivo> import <elemento<class>>
from typing import overload
from animal import Animal

class Snake(Animal):
    def __init__(self, name, is_venom):
        #opcion 1: 
        super().__init__(name)
        #opcion 2: Animal.__init__(name)
        self.is_venom = is_venom

    def make_sound(self):
        print(self.name + " sisea: SSSSS...")

    