package basicJava;

import basicJava.packagesPractice.Human;

public class packagesPracticeTest {
    public static void main(String[] args) {
        Hat hat = new Hat("red");
        Human h = new Human(hat);
        h.askHatColor();
    }

}
