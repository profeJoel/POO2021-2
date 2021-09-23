#include<stdio.h>
#include<string.h>
#define L 30
#define N 3

typedef struct automovil{
    //3 variables
    char marca[L];
    char modelo[L];
    int anho;
    char duenho[L];
}vehiculo;

void ingresar_autos(vehiculo *a){
    printf("Ingrese la Marca del auto:");
    scanf("%s", &a->marca); // cuando se asigna en una estructura con puntero se usa ->
    printf("Ingrese el Modelo del auto:");
    scanf("%s", &a->modelo);
    do{
        printf("Ingrese el Anho del auto:");
        scanf("%d", &a->anho);
    }while(a->anho <= 1900 || a->anho >= 2021);
    printf("Ingrese el nombre del Duenho del auto:");
    scanf("%s", &a->duenho);
}

void modificar(vehiculo *a, char marca[], char modelo[], int anho, char duenho[]){
    if(marca!=NULL)
        strcpy(a->marca, marca);
    if(modelo!=NULL)
        strcpy(a->modelo, modelo);
    if(anho>=1900 && anho<=2021)
        a->anho = anho;
    if(duenho!=NULL)
        strcpy(a->duenho, duenho);
}

void imprimir_autos(vehiculo *a){
    printf("Marca: %s, Modelo: %s, Anho: %d, Duenho: %s\n", a->marca, a->modelo, a->anho, a->duenho);
}

void intercambio(vehiculo *destino, vehiculo *origen){
    strcpy(destino->marca, origen->marca);
    strcpy(destino->modelo, origen->modelo);
    destino->anho=origen->anho;
    strcpy(destino->duenho, origen->duenho);
}

void ordenar_por_anho(vehiculo lista[]){
    int i, j;
    vehiculo aux;

    for(i=0; i<N; i++){
        for(j=0;j<N;j++){
            if(lista[i].anho > lista[j].anho){ //ordenamiento descendente
                //intercambio
                intercambio(&aux, &lista[i]);
                intercambio(&lista[i], &lista[j]);
                intercambio(&lista[j], &aux);
            }
        }
    }
}

void ordenar_por_marca(vehiculo lista[]){
    int i, j;
    vehiculo aux;

    for(i=0; i<N; i++){
        for(j=0;j<N;j++){
            if(lista[i].marca[0] < lista[j].marca[0]){ //ordenamiento descendente
                //intercambio
                intercambio(&aux, &lista[i]);
                intercambio(&lista[i], &lista[j]);
                intercambio(&lista[j], &aux);
            }
        }
    }
}

int main(){
    int i;
    vehiculo lista_autos[N];
    for(i=0; i<N; i++)
        ingresar_autos(&lista_autos[i]);

    printf("\nLista de Autos Ingresados\n");
    for(i=0; i<N; i++)
        imprimir_autos(&lista_autos[i]);

    printf("\nLista de Autos Ordenado por Anho\n");
    ordenar_por_anho(lista_autos);
    for(i=0; i<N; i++)
        imprimir_autos(&lista_autos[i]);
        
    printf("\nLista de Autos Ordenado por Marca\n");
    ordenar_por_marca(lista_autos);
    for(i=0; i<N; i++)
        imprimir_autos(&lista_autos[i]);

    return 0;
}