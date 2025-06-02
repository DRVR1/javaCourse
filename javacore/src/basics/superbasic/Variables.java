package basics.superbasic;

class Variables {
    public static void main(String args[]) {
        System.out.println("Hello world");
        char varChar = 'a';
        boolean varBool = true;
        int varInt = 122;
        float varFloat = 1.22f;
        double varDouble = 1.22;
        byte varByte = 12;

        int longNumber = 10_000_000;
        int binary = 0b1010;
        int hex = 0x7FA;

        char ch = 'a';
        char result = (char) (ch + 1);
        System.out.println(result);

        System.out.println(varInt++); // Notar que sigue siendo 122, por ser un post increment. Esto sirve para
                                      // bucles, listas, etc.
        System.out.println(++varInt); // Ahora si vale 123 (pre increment)
    }
}
