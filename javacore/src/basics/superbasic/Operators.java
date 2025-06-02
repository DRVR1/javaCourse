package basics.superbasic;

class Operators {
    public static void main(String args[]) {
        int x = 1;
        int y = 2;
        int z = 3;
        if (x < 10) {
            System.out.println("x is less than 10, breaking.");
        } else if (y < 10) {
            System.out.println("y is less than 10 but x is not less than 10, breaking.");
        } else {
            System.out.println("neither are less than 10");
        }

        boolean a = x < 10 ? true : false; // operadores ternarios
        System.out.println(a);
    }
}
