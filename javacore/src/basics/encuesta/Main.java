package basics.encuesta;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = (x++ > 5 && y-- < 10) ? x-- : y;

        System.out.println("x: " + x + "; y: " + y);
    }
}
