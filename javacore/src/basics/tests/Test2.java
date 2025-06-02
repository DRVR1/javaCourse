package basics.tests;

// What does arr[arr.length-1].length represents in a multidimensional array?

public class Test2 {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(arr[arr.length - 1].length);
        // El tamaño del array es 3, pero el indice comienza en 0, por lo que sin el -1,
        // nos estariamos saliendo del indice, cuyo ultimo valor debe ser 2
    }

}
