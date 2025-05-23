package basicJava;

class Calculator {
    public String name;
    public static String sharedName;

    public Calculator(String name) {
        this.name = name;
    }

    public static void printStaticName() {
        System.out.println(sharedName);
    }

    static {
        System.out.println(
                "Aca puedo inicializar variables estaticas, o ejecutar codigo una vez sola, justo antes de la instanciacion del primer objeto. Luego no se ejecutara mas.");
    }

    public void printName() {
        System.out.println(this.name);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public float div(int a, int b) {
        return a / b;
    }

    public int mod(int a, int b) {
        return a % b;
    }
}

public class JClasses {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("basicJava.Calculator");
        System.out.println("Class was loaded in memory and static block was executed.");

        System.out.println("Instantiating class...");
        Calculator calc;
        calc = new Calculator("Braian");
        calc.printName();

        System.out.println(calc.add(1, 4));
        System.out.println(calc.mod(10, 3));

        Calculator.sharedName = "Calculator static";
        System.out.println(Calculator.sharedName);
        Calculator.printStaticName();
    }
}
