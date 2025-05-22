package basicJava;

public class Arrays {
    public static void main(String[] args) {

        // Array 1
        int[] arr = {1,2,3,4};
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        // Array 2
        int[] arr2 = new int[4];
        System.out.println(arr2[3]);
        arr2[3] = 122;
        System.out.println(arr2[3]);
    }
}
