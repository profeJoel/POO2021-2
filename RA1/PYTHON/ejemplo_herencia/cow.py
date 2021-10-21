#from <archivo> import <elemento<class>>
from typing import overload
from animal import Animal

class Cow(Animal):
    def __init__(self, name, horn_size):
        #opcion 1: 
        super().__init__(name)
        #opcion 2: Animal.__init__(name)
        self.horn_size = horn_size

    def make_sound(self):
        print(self.name + " brama: MUUU...")

    