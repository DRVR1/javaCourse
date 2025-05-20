package basicJava;

public class LogicOps {
        public static void main(String args[]){
            int x = 1;
            int y = 2;
            int z = 3;
            if (x < 5 || y < 5 && z < 5){
                System.out.println("Hello");
            }
            // Devuelve true si X o Y es menor a 5 pero Z debe ser menor que 5
            y = x;
            if(y==x){
                System.out.println("x es igual a y");
            }
    }
}
