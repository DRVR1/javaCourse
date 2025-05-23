package basicJava;

public class Strings {
    public static void main(String[] args) {
        String str0 = "Hello"; // Creo un objeto string , Hello se almacena en el heap y en el stack, str0
                               // apunta a esa direccion en el heap
        String str1 = "Hello"; // Se crea una nueva referencia en el stack, pero al momento de crear Hello en
                               // el heap, java nota que en el pool de strings ya existe la palabra Hello, por
                               // lo que str0 y str1 van a apuntar a la misma direccion, es decir, no se crea
                               // un nuevo objeto.
        String str = new String("Hello"); // Ahora sí se crea una nueva palabra Hello en el heap, sin importar si ya
                                          // existía antes, ya que "new" fuerza este comportamiento

        str += " World"; // Como String es inmutable, se crea una nueva variable en el heap "Hello World"
        System.out.println(str);
    }
}
