public class Main {
    public static void main(String[] args) {
        System.out.print("Input your name: ");
        try {
            int asciiChar = System.in.read();
            System.out.println(asciiChar);

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
