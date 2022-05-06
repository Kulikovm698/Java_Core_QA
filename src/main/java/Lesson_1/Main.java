package Lesson_1;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Vasya", "Grey", 5);
        Cat cat2 = new Cat("Dan", "Black", 1);
        Cat cat3 = new Cat("Dan", "Black", 1);

        System.out.println(cat2.equals(cat3));

        Wolf wolf = new Wolf("Тревор", "Серый", 6);

        Animal cat4 = new Cat("Dan", "Black", 1);

//        if (cat4 instanceof Wolf){
//            Wolf cat5 = (Wolf) cat4;
//        }else {
//            System.out.println("Не является волком!");
//        }

        Cat catCompetitor1 = new Cat("Морис", "Red", 10);
        catCompetitor1.setSwimmingSpeed(10);
        Wolf wolfCompetitor2 = new Wolf("Тревор", "Red", 15);
        wolfCompetitor2.setSwimmingSpeed(30);
        Turtle turtleCompetitor3 = new Turtle("Сплинтер", "Grey", 20);
        turtleCompetitor3.setSwimmingSpeed(10);

        Pool[] pools = {new Pool(200), new Pool(100), new Pool(534)};
        for (Pool pool : pools) {
            pool.getTimeToOvercomePool(catCompetitor1);
            pool.getTimeToOvercomePool(wolfCompetitor2);
            pool.getTimeToOvercomePool(turtleCompetitor3);
        }

        Utils.makeAnimalOlder(cat1);
    }

}

/*
приведение типов
((Cat)cat4).setWild(true);
instanceof проверят принадлежит ли объект классу, который справа (cat4 instanceof Wolf)
 */