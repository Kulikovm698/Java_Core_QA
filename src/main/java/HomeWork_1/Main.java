package HomeWork_1;

import HW_1.Overcomeble;

public class Main {

    public static void main(String[] args) {
        Competing[] competings = {
                new Human("Человек обычный", 2, 100),
                new Robot("Робот обычный", 5, 500),
                new Cat("Котик", 4, 200)
        };

        Overcomable[] overcomables = {new Wall(4), new RoadRun(253)};

        for (Competing competing : competings) {
            for (Overcomable overcomable : overcomables) {
                overcomable.overcome(competing);
            }
        }
    }

}
