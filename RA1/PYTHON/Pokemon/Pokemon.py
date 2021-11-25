import random

class Pokemon:

    def __init__(self, nombre, tipo, pc):
        self.nombre = nombre
        self.tipo = tipo
        self.pc = pc
        self.vida = None

        self.puntos_ataque = random.randrange(10,21) #(3,8) -> [3,7]
        self.puntos_ataque_cargado = random.randrange(50,101)
        self.estado = None

    def get_pc(self):
        return self.pc

    def __str__(self):
        return "\nEl pokemon se llama " + self.nombre + " de tipo " + self.tipo + " con PC " + str(self.pc) + "\n - Ataque Simple = " + str(self.puntos_ataque) + "\n - Ataque Cargado = " + str(self.puntos_ataque_cargado)
        