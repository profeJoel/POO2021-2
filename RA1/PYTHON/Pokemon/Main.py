from Pokemon import Pokemon
from Entrenador import Entrenador
from Combate import Combate

if __name__ == "__main__":
    ash = Entrenador("Ash", "Pueblo Paleta", "hombre", 11)
    misty = Entrenador("Misty", "Ciudad Celeste", "mujer", 13)

    ash.completar_equipo()
    print(ash)

    misty.completar_equipo()
    print(misty)

    gimnacio_ciudad_celeste = Combate(ash, misty, "Cascada")
    gimnacio_ciudad_celeste.iniciar_combate()

    print(">>>>> Luego del Enfrentamiento::")
    print(ash)
    print(misty)