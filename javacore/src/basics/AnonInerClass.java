package basics;

class A {
    public void talk() {
        System.out.println("im A");
    }
}

public class AnonInerClass {
    public static void main(String[] args) {
        A a = new A() {
            public void talk() {
                System.out.println("A reimplementation of the talk method");
            }
        };
        a.talk();
    }
}
