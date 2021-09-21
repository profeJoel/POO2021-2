#include<stdio.h>

int contar_letras(char p[], int cantidad)
{
    //Caso base
    if(p[cantidad]=='\0')
        return cantidad;
    //caso recursivo
    else
        return contar_letras(p, cantidad+1);
}

int main()
{
    char palabra[24];
    int cantidad_letras;
    printf("Ingrese una palabra: ");
    scanf("%s", palabra);

    cantidad_letras = contar_letras(palabra,0);

    printf("la cantidad de letras es %d ", cantidad_letras);
    return 0;
}