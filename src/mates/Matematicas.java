package mates;
import java.util.ArrayList;
import java.util.function.DoubleSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Matematicas {

    //1. La suma 0 + 1 + 2 + ... + n.
    public static int suma(int n) {
        return IntStream.range(1, n+1)
        .sum();
    }

    //2. El factorial de un número.
    public static int factorial(int n) {
        return IntStream.range(1, n+1)
        .reduce(1, (a, b) -> a * b);
    }

    //3. La potencia n-ésima de un número natural.
    public static int potencia(int base, int exponente) {
        return IntStream.range(0, exponente)
        .reduce(1, (a, b) -> a * base);
    }

    //4. La suma de los elementos de una lista de números.
    public static int sumaLista(ArrayList<Integer> lista) {
        return lista.stream().mapToInt(Integer::intValue)
        .sum();
    }

    //5. La media aritmética de una lista de números.
    public static double mediaAritm(ArrayList<Integer> lista) {
        return lista.stream().mapToInt(Integer::intValue)
        .average().orElse(0);
    }

    //6. La desviación típica de una lista de números.
    public static double desviacionT(ArrayList<Integer> lista) {
        double media = mediaAritm(lista);
        return Math.sqrt(lista.stream()
        .mapToDouble(num -> Math.pow(num - media, 2)).sum() / lista.size());
    }

    //7. La suma de los primeros números pares hasta n asumiendo n ≥ 2. 
    //Por ejemplo, sumaPares(9) = 8 + 6 + 4 + 2 = 20.
    public static int sumaPar(int n) {
        return IntStream.range(0, n+1)
        .filter(x -> x % 2 == 0).sum();
    }

    //8. La suma de los elementos pares de una lista de enteros. 
    //Por ejemplo,sumaPares([1, 2, 3, 4]) = 6.
    public static int sumaParLista(ArrayList<Integer> lista) {
        return lista.stream().filter(num -> num % 2 == 0)
        .mapToInt(Integer::intValue).sum();
    }

    //9. Dada una lista de números naturales mayores o iguales que 2, 
    //obtiene otra lista con los números pares de la lista inicial, en el mismo orden y respetando los números repetidos. 
    //Por ejemplo, obtenerListaPar([1, 2, 6, 11]) = [2, 6]
    public static ArrayList<Integer> obtenerListaP(ArrayList<Integer> lista) {
        return (ArrayList<Integer>) lista.stream().filter(num -> num % 2 == 0)
        .collect(Collectors.toList());
    }

    //10. La lista de los primeros números pares hasta n asumiendo n ≥ 2. 
    //Por ejemplo, listaPar(9) = [8, 6, 4, 2].
    public static ArrayList<Integer> listaPar(int n) {
        return (ArrayList<Integer>) IntStream.range(2, n+1)
        .filter(x -> x % 2 == 0)
        .boxed()
        .collect(Collectors.toList());
     }

     //11. Producto escalar de dos listas de números no vacías y del mismo tamaño. 
     //Por ejemplo, calcularProductoEscalar([1, 2, 3], [2, 4, 6]) = 1 · 2 + 2 · 4 + 3 · 6 = 2 + 8 + 18 = 28.
    public static int productoEscalar(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        return IntStream.range(0, lista1.size())
        .map(i -> lista1.get(i) * lista2.get(i)).sum();
     }

     //12. El elemento n-ésimo de la sucesión de Fibonacci.
    public static int fibonacci(int n) {
        return IntStream.range(0, n)
        .reduce((a, b) -> {
            if (b == 0) return b;
            else if (b == 1) return 1;
            else return a + b;
            })
            .orElse(0);
    }

    //13. Calcule el cociente entre el decimo tercer y el decimo segundo elementode la sucesión de Fibonacci, y compare el resultado con (1+√5)/2.
    public static DoubleSupplier cociente = () -> {
        int fibonacci1 = fibonacci(13);
        int fibonacci2 = fibonacci(12);
        return (double) fibonacci1 / fibonacci2;
    };

    //14. Averigüe la relación entre la sucesión de Fibonacci y la razón áurea.
    public static DoubleSupplier razonAurea = () -> (1 + Math.sqrt(5)) / 2;

}
     
