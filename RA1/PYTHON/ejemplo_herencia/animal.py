class Animal:
    #constructor
    def __init__(self, name):
        self.name = name

    def eat(self, something):
        print(self.name + " come " + something)

    def make_sound(self):
        print(self.name + " hace un sonido... ")

    def get_name(self):
        return self.name

    def set_name(self, new_name):
        if new_name == None or new_name == "":
            print("Set name es denial...")
        else:
            self.name = new_name