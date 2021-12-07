from Animal import Animal

class Gato(Animal):
    def __init__(self, nombre):
        self.nombre = nombre

    def haceRuido(self, ruido):
        print(self.nombre + " hace el ruido: " + ruido)