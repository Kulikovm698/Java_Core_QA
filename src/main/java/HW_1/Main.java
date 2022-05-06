package HW_1;

public class Main {

    public static void main(String[] args) {
        Competing[] competings = {new Cat("Кот Барсик", 5, 10),
                new Human("Борис", 1, 20),
                new Robot("Робот Валли", 4, 40)};


        Overcomeble[] overcomebles = {new Wall(1), new RoadRun(2)};

        for (Competing competing : competings) {
            for (Overcomeble overcomeble : overcomebles) {
                overcomeble.overcome(competing);
            }
        }
    }
}

