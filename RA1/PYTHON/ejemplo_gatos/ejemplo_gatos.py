from gato import Gato # debemos importar la clase correspondiente

#Declaración de la función principal
if __name__ == "__main__":
    oscar = Gato("Óscar", "macho", 3, 7, "marrón", "rayado")

    print(oscar.dar_informacion())

    #oscar._color = "verde"
    #oscar.__color = "verde"

    oscar.add_age()
    oscar.change_color("verde")
    print(oscar.dar_informacion())