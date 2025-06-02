package basics.interfaces;

public class D extends C implements A, B {
    public void talkA() {
        System.out.println("A");
    }

    public void talkB() {
        System.out.println("B");
    }
}
