#include<stdio.h>
#include<string.h>

//La estructura es una plantilla de persona
typedef struct humano{
    char nombre[30];
    int edad;
}persona;

int main(){
    //forma de declaración con el alias
    persona estudiante; //instancias de las personas
    //forma de declaración sin alias
    struct humano empleado; //Instancias de los humanos

    strcpy(estudiante.nombre, "Juan Perez"); // arg1 es el destino, arg2 es el recurso
    estudiante.edad = 18;

    printf("Ingrese su nombre: ");
    gets(empleado.nombre);
    printf("Ingrese la edad: ");
    scanf("%d", &empleado.edad);

    printf("Datos del Estudiante: \n");
    printf("Nombre: %s\n", estudiante.nombre);
    printf("Edad: %d\n", estudiante.edad);
    
    printf("Datos del Empleado: \n");
    printf("Nombre: %s\n", empleado.nombre);
    printf("Edad: %d\n", empleado.edad);

    return 0;
}