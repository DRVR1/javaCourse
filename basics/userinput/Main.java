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
        System.out.print("Ingrese algo: ");
        String str = scanner.nextLine();
        System.out.println("Ingresado: " + str);
    }
}
