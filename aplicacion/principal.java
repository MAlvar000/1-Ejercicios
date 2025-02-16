package aplicacion;

import mates.Solucion;

public class principal {
    public static void main(String[] args){
        int n = 30;
        Solucion.suma(n);
        Solucion.factorial(n);
        Solucion.potencia(8,6);
        int[] listaNumeros = {1, 2, 3, 4, 5};
        Solucion.sumaLista(listaNumeros);
        Solucion.mediaAritmetica(listaNumeros);
        Solucion.desviacionTipica(listaNumeros);
        Solucion.sumaPares(n);
        int[] listaEnteros = {2, 5, 8, 11, 14};
        Solucion.sumaElementosPares(listaEnteros);
        Solucion.obtenerListaPar(listaEnteros);
        Solucion.listaPar(n);
        int[] listaA = {1, 3, 5};
        int[] listaB = {2, 4, 6};
        Solucion.calcularProductoEscalar(listaA, listaB);
    }
}
