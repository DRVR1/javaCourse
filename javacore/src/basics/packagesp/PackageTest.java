package basics.packagesp;

import basics.packagesp.livingbeings.Human;
import basics.packagesp.wearing.Hat;

public class PackageTest {
    public static void main(String[] args) {
        Hat hat = new Hat("red");
        Human h = new Human(hat);
        h.askHatColor();
    }

}
