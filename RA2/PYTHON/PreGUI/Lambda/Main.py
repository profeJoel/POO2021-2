import math

def doble(a):
    return a*2

def distancia(dX, dY):
    return math.sqrt(dX+dY)

if __name__ == "__main__":
    # var = lambda (argumentos) : (expresion)

    por_dos = lambda a: a*2

    print(por_dos(5))
    print(doble(5))

    A = [1,1]
    B = [2,1]

    deltaX = lambda P1,P2: P2[0] - P1[0]
    deltaY = lambda P1,P2: P2[1] - P1[1]

    print("La distancia es: ", distancia(deltaX(A,B), deltaY(A,B)))