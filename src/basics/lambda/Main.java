package basics.lambda;

public class Main {
    public static void main(String[] args) {

        // We have A, a functional interface (it only allows one and only method)
        // We can implement the interface in runtime, and instantiate an anonymous
        // class.
        A a = new A() {
            public String salute(String name) {
                return "(a1) Hello, " + name;
            }
        };

        // But.. we can make it less verbose with the lambda (->) expression. We dont
        // have to specify type of return, neither the parameter type
        A a2 = (name) -> {
            return "(a2) Hello, " + name;
        };

        // a less verbose way
        A a3 = (name) -> "(a3) Hello, " + name;

        System.out.println(a.salute("ian"));
        System.out.println(a2.salute("ian"));
        System.out.println(a3.salute("ian"));
    }
}
