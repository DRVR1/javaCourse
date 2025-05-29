package basics.abstracts;

import basics.abstracts.Bmw;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw(300, "bmw");
        bmw.playMusic();
        bmw.accelerate();
        bmw.brake();

    }
}
