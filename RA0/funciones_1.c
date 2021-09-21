#include<stdio.h>

int contar_letras(char p[])
{
    int cantidad;
    for(cantidad = 0; p[cantidad]!='\0';cantidad++);
        //printf("%c\n",p[cantidad]);
    return cantidad;
}

int main()
{
    char palabra[24];
    int cantidad_letras;
    printf("Ingrese una palabra: ");
    scanf("%s", palabra);

    cantidad_letras = contar_letras(palabra);

    printf("la cantidad de letras es %d ", cantidad_letras);
    return 0;
}