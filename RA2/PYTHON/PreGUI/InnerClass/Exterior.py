class Exterior:

    def __init__(self, text):
        self.text = text
        self.interior = self.Interior("interior")
    
    def mostrar(self):
        print("Texto objeto Exterior: " + self.text)
    
    class Interior:
        def __init__(self, text):
            self.text = text

        def mostrar(self):
            print("Texto objeto Interior: " + self.text)
