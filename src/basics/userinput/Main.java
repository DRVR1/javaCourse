import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // in.read()
        System.out.print("Enter character: ");
        try {
            // Consume solo el primer caracter del buffer, dejando el resto de los
            // caracteres y el salto de linea
            int asciiChar = System.in.read();
            System.out.println("First char's ascii is: " + asciiChar);
            // Consumir el buffer restante hasta que haya un salto de linea (y consumirlo
            // tambien)
            while (System.in.read() != '\n') {
            }

        } catch (Exception e) {
        }

        // Obtener string con buffered reader
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("\n");
        System.out.print("input a string: ");
        try {
            String str = bufferedReader.readLine();
            System.out.println("Your string is: " + str);
        } catch (Exception e) {
        }

        // Una opcion mas simple: Scanner
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("input something: ");
            String str = scanner.nextLine();
            System.out.println("Input: " + str);
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            // scanner.close();
            // Si cerramos el scanner ahora, no lo podemos usar mas porque cierra System.in
        }

        try (Scanner scanner2 = new Scanner(System.in)) { // Cierra el scanner (ya no se puede usar luego)
            System.out.print("Input again: ");
            String str = scanner2.nextLine();
            System.out.println("input: " + str);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
