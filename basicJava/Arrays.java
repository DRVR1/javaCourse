package basicJava;

public class Arrays {
    public static void main(String[] args) {
        // Array 1
        System.out.println("Array 1");
        int[] arr = { 1, 2, 3, 4 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("\n");

        // Array 2
        System.out.println("Array 2");
        int[] arr2 = new int[4];
        System.out.println(arr2[3]);
        arr2[3] = 122;
        System.out.println(arr2[3]);
        System.out.println("\n");

        // Array of arrays
        System.out.println("Arrays of arrays");
        int[][] arr3 = { { 1, 2, 3 }, { 4, 5, 6 } };
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println(arr3[i][j]);
            }
        }

        // Random numbers
    }
}
