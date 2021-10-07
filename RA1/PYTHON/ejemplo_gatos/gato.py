class Gato:
    #atributos
    #No es necesaria

    #métodos
    #Constructor
    def __init__(self, name, sex, age, weight, color, texture):
        # atributos
        # SELF se refiere a los atributos propios de un objeto
        #VISIBILIDAD
        #<nombre_variable> = public
        #_<nombre_variable> = protegido (acuerdo de desarrolladores)
        #__<nombre_variable> = privado (genera un error en la interpretacion)
        self.__name = name
        self.__sex = sex
        self.__age = age
        self.__weight = weight
        self.__color = color
        self.__texture = texture

    def dar_informacion(self):
        return "Información Gato: \n\tname: " + self.__name + "\n\tsex: " + self.__sex + "\n\tage: " + str(self.__age) + "\n\tweight: " + str(self.__weight) + "\n\tcolor: " + self.__color + "\n\ttexture: " + self.__texture
    
    def add_age(self):
        self.__age += 1

    def change_color(self, new_color):
        colores = ["blanco", "marrón", "gris", "bicolor", "rojizo", "rubio"]
        acepted_color = False

        for color in colores:
            if new_color == color:
                acepted_color = True
        
        if acepted_color:
            self.__color = new_color
        else:
            print("El color no es aceptado")
