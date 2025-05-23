package basicJava.packagesPractice;

import basicJava.Hat;

public class Human {
    Hat hat;

    public Human(Hat hat) {
        this.hat = hat;
    }

    public void askHatColor() {
        System.out.println("Hey! My hat is " + this.hat.getColor());
    }

}
