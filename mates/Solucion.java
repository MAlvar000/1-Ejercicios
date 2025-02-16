package mates;
public class Solucion{

public static int suma(int n){
    int suma=0;
    for(int i=0; i<=n; i++){
      suma++;  
    }
    System.out.println("la suma de los numeros del 1 al "+n+" es: "+suma);
    return suma;
}
public static int factorial(int fact){
    int factorial=fact;
    for(int i=fact-1; i>0; i--){
        factorial= factorial*i;
    }
    System.out.println("el factorial de "+fact+"es: "+factorial);
    return factorial;
}
public static int potencia(int num, int n){
    int potencia=1;
    for(int i=1; i<=n; i++){
        potencia= potencia*num;
    }
    System.out.println("la potencia de "+num+" elevado a "+n+"es: "+potencia);
    return potencia;
}
    
public static int sumaLista(int[] lista) {
    int suma = 0;
    for (int i = 0; i < lista.length; i++) {
        suma += lista[i];
    }
    System.out.println("La suma de la lista es: " + suma);
    return suma;
}

public static double mediaAritmetica(int[] lista) {
    int suma = 0;
    for (int i = 0; i < lista.length; i++) {
        suma += lista[i];
    }
    double media = (double) suma / lista.length;
    System.out.println("La media aritmética de la lista es: " + media);
    return media;
}

public static double desviacionTipica(int[] lista) {
    int n = lista.length;
    double suma = 0;
    for (int i = 0; i < n; i++) {
        suma += lista[i];
    }
    double media = suma / n;

    double sumaDesviaciones = 0;
    for (int i = 0; i < n; i++) {
        sumaDesviaciones += Math.pow(lista[i] - media, 2);
    }
    double varianza = sumaDesviaciones / n;
    double desviacion = Math.sqrt(varianza);
    System.out.println("La desviación típica de la lista es: " + desviacion);
    return desviacion;
}


public static int sumaPares(int n) {
    int suma = 0;
    for (int i = n - n % 2; i >= 2; i -= 2) {
        suma += i;
    }
    System.out.println("La suma de los números pares hasta " + n + " es: " + suma);
    return suma;
}


public static int sumaElementosPares(int[] lista) {
    int suma = 0;
    for (int i = 0; i < lista.length; i++) {
        if (lista[i] % 2 == 0) {
            suma += lista[i];
        }
    }
    System.out.println("La suma de los elementos pares de la lista es: " + suma);
    return suma;
}


public static int[] obtenerListaPar(int[] lista) {
    int contadorPares = 0;
    for (int i = 0; i < lista.length; i++) {
        if (lista[i] % 2 == 0) {
            contadorPares++;
        }
    }
    int[] pares = new int[contadorPares];
    int indice = 0;
    for (int i = 0; i < lista.length; i++) {
        if (lista[i] % 2 == 0) {
            pares[indice] = lista[i];
            indice++;
        }
    }
    System.out.print("La lista de números pares es: ");
    for (int i = 0; i < pares.length; i++) {
        System.out.print(pares[i] + " ");
    }
    System.out.println();
    return pares;
}
public static int[] listaPar(int n) {
    int tamaño = n / 2;
    int[] pares = new int[tamaño];
    int indice = 0;
    for (int i = n - n % 2; i >= 2; i -= 2) {
        pares[indice] = i;
        indice++;
    }
    System.out.print("La lista de números pares hasta " + n + " es: ");
    for (int i = 0; i < pares.length; i++) {
        System.out.print(pares[i] + " ");
    }
    System.out.println();
    return pares;
}

public static int calcularProductoEscalar(int[] lista1, int[] lista2) {
    if (lista1.length != lista2.length) {
        throw new IllegalArgumentException("Las listas deben tener el mismo tamaño.");
    }
    int productoEscalar = 0;
    for (int i = 0; i < lista1.length; i++) {
        productoEscalar += lista1[i] * lista2[i];
    }
    System.out.println("El producto escalar de las dos listas es: " +productoEscalar);
    return productoEscalar; 
}
}