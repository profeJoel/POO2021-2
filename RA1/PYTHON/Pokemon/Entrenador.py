from Pokemon import Pokemon

class Entrenador:
    def __init__(self, nombre, origen, genero, edad):
        self.nombre = nombre
        self.origen = origen
        self.genero = genero
        #self.equipo = [] # [] indica un arreglo vacío
        self.equipo = [None] * 3 # resguarda 3 espacios de memoria
        self.medalla = [None] * 8
        self.cantidad_pokemon = 0
        self.cantidad_medallas = 0

    def get_pokemon(self, indice):
        return self.equipo[indice]

    def get_nombre(self):
        return self.nombre

    def capturar_pokemon(self):

        if self.cantidad_pokemon >= 0:
            print("Ingrese el nombre del pokemon: ")
            nombre = input()
            print("Ingrese el tipo del  pokemon: ")
            tipo = input()
            print("Ingrese el PC del Pokemon: ")
            pc = int(input())

            nuevo_pokemon = Pokemon(nombre, tipo, pc)
            self.equipo[self.cantidad_pokemon] = nuevo_pokemon
            self.cantidad_pokemon += 1

            if self.cantidad_pokemon == 3:
                self.cantidad_pokemon = -1

    def completar_equipo(self):
        for i in range(3):
            self.capturar_pokemon()

    def gana_medalla(self, nombre_medalla):
        self.medalla[self.cantidad_medallas] = nombre_medalla
        self.cantidad_medallas += 1

    def __str__(self):
        return "\nEntrenador " + self.nombre + " de " + self.origen + " con " + str(self.cantidad_medallas) + " medallas y un equipo pokemon de: \n * " + str(self.equipo[0]) + "\n * " + str(self.equipo[1]) + "\n * " + str(self.equipo[2])
