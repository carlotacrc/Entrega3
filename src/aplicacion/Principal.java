package aplicacion;

import mates.Matematicas;
import java.util.ArrayList;
import java.util.function.DoubleSupplier;

public class Principal {
    public static void main(String[] args) {
        //1. La suma 0 + 1 + 2 + ... + n.
        System.out.println(Matematicas.suma(10));
        //2. El factorial de un número.
        System.out.println(Matematicas.factorial(5));
        //3. La potencia n-ésima de un número natural.
        System.out.println(Matematicas.potencia(2, 3));
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(2);
        lista2.add(4);
        lista2.add(6);
        //4. La suma de los elementos de una lista de números.
        System.out.println(Matematicas.sumaLista(lista));
        //5. La media aritmética de una lista de números.
        System.out.println(Matematicas.mediaAritm(lista));
        //6. La desviación típica de una lista de números.
        System.out.println(Matematicas.desviacionT(lista));
        //7. La suma de los primeros números pares hasta n asumiendo n ≥ 2. Por ejemplo, sumaPares(9) = 8 + 6 + 4 + 2 = 20.
        System.out.println(Matematicas.sumaPar(9));
        //8. La suma de los elementos pares de una lista de enteros. Por ejemplo,sumaPares([1, 2, 3, 4]) = 6.
        System.out.println(Matematicas.sumaParLista(lista));
        //9. Dada una lista de números naturales mayores o iguales que 2, obtiene otra lista con los números pares de la lista inicial, en el mismo orden y respetando los números repetidos. 
        //Por ejemplo, obtenerListaPar([1, 2, 6, 11]) = [2, 6]
        System.out.println(Matematicas.obtenerListaP(lista));
        // //10. La lista de los primeros números pares hasta n asumiendo n ≥ 2. Por ejemplo, listaPar(9) = [8, 6, 4, 2].
        System.out.println(Matematicas.listaPar(9));
        //11. Producto escalar de dos listas de números no vacías y del mismo tamaño. Por ejemplo, calcularProductoEscalar([1, 2, 3], [2, 4, 6]) = 1 · 2 + 2 · 4 + 3 · 6 = 2 + 8 + 18 = 28.
        System.out.println(Matematicas.productoEscalar(lista1, lista2));
        //12. El elemento n-ésimo de la sucesión de Fibonacci
        System.out.println(Matematicas.fibonacci(10));
        //13. Calcule el cociente entre el decimo tercer y el decimo segundo elementode la sucesión de Fibonacci, y compare el resultado con (1+√5)/2.
        System.out.println(Matematicas.cociente.getAsDouble());
        ////14. Averigüe la relación entre la sucesión de Fibonacci y la razón áurea.
        System.out.println(Matematicas.razonAurea.getAsDouble());


    }

    
}
