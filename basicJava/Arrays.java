package basicJava;

public class Arrays {
    public static void main(String[] args) {
        // Array 1
        System.out.println("1 - Array 1");
        int[] arr = { 1, 2, 3, 4 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("\n");

        // Array 2
        System.out.println("2 - Array 2");
        int[] arr2 = new int[4];
        System.out.print(arr2[3]);
        arr2[3] = 122;
        System.out.print(arr2[3]);
        System.out.println("\n");

        // 3 Array of arrays
        System.out.println("3 - Arrays of arrays");
        int[][] arr3 = { { 1, 2, 3 }, { 4, 5, 6 } };
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j]);
            }
        }
        System.out.println("\n");

        // 4 - Array of arrays again
        System.out.println("4 - arr of arrs again");
        int[][] arr4 = { { 1, 2, 3 }, { 4, 5, 6 } };
        for (int x[] : arr4) { // x now represents each array contained in arr4
            for (int v : x) {
                System.out.print(v + " ");
            }
        }

        /// 5 - Jagged array
        int[][] jagged1 = new int[2][];
        int[][] jagged2 = { { 1, 2 }, { 1, 2, 3 } };

        // 6 - 3D arrays
        int[][][] a3D1 = new int[5][5][5];
    }
}
