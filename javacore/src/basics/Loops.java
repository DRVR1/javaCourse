package basics;

public class Loops {
    public static void main(String[] args) {

        // while loop
        int a = 0;
        while (a < 3) {
            System.out.println("a es menor que 3. a = " + a);
            a++;
        }

        // do while loop
        int b = 0;
        do {
            System.out.println("b es menor a 10");
            b++;
        } while (b < 3);

        // For loop
        for (int c = 0; c < 3; c++) {
            System.out.println("c: " + c);
            for (int d = 0; d < 3; d++) {
                System.out.println("d: " + d);
            }
        }
    }
}
