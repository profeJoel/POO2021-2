from abc import ABC, abstractmethod

class Animal(ABC):
    @abstractmethod
    def haceRuido(self,ruido):
        pass