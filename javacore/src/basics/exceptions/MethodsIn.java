package basics.exceptions;

public class MethodsIn {
    public void a() throws Exception {
        int a = 1;
        int b = 0;
        System.out.println(a / b); // Creates an exception but throws it to the caller instead of interrupting code
                                   // exectution
    }

    public void b() throws Exception {
        this.a(); // Throws the exception again to the caller
    }

}
