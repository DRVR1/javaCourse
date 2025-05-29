package basics;

class A {
    public void talk() {
        System.out.println("im class A");
    }

    static class B {
        public void talk() {
            System.out.println("im class B");
        }
    }

    class C {
        public void talk() {
            System.out.println("im class C");
        }
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        A a = new A();
        a.talk();
        A.B b = new A.B(); // For static inner classes
        b.talk();
        A.C c = a.new C(); // For non static inner classes
        c.talk();
    }
}
