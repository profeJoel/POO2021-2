from Pokemon import Pokemon
from Entrenador import Entrenador

class Combate:
    def __init__(self, e1, e2, nombre_medalla):
        self.puntos_e1 = 0
        self.puntos_e2 = 0

        self.e1 = e1
        self.e2 = e2
        self.nombre_medalla = nombre_medalla

    def iniciar_combate(self):
        for i in range(3):
            if self.e1.get_pokemon(i).get_pc() >= self.e2.get_pokemon(i).get_pc():
                self.puntos_e1 += 1
            else:
                self.puntos_e2 += 1

        if self.puntos_e1 >= 2:
            print("El ganador es: " + self.e1.get_nombre())
            self.e1.gana_medalla(self.nombre_medalla)
        else:
            print("El ganador es: " + self.e2.get_nombre())
            self.e2.gana_medalla(self.nombre_medalla)
