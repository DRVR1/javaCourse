package basics.tests;

class Test {

    public static void main(String[] args) {

        String password[] = { "XY01", "XY02", "XY03", "XY04" };

        String result = " ";

        for (int i = password.length - 1; i >= 2; i--) {

            result = result + password[i];

        }

        System.out.println(result);
    }

}

// inicialmente i vale 3
// mientras i >= 2, itero decrementando i
// al resultado le agrego los Strings contenidos en password, comenzando del
// indice 3, y yendo hacia atras
// "XY03", "XY04" seran agregados, pero luego i sera menor a 2, asi que se corta
// la iteracion. por lo que "XY01", "XY02" quedarian excluidos
// pero, hay que recordar que las posiciones fueron añadidas al reves (arr[3] y
// luego arr[2])
// por lo que el resultado quedaria: XY04XY03