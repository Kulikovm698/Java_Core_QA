package Lesson_1;

public class Main {
    public static void main(String[] args) {

//        Cat cat1 = new Cat("Vasya", "Grey", 5);
//        Cat cat2 = new Cat("Dan", "Black", 1);
//        Cat cat3 = new Cat("Dan", "Black", 1);

//        System.out.println(cat1);
//        System.out.println(cat2.equals(cat3));
//
//        Wolf wolf = new Wolf("Тревор","Серый", 6);
//
//        Animal cat4 = new Cat("Dan", "Black", 1);

        /**Приведение типов для доспута к методам, которые есть
         у класса Cat
         **/

//        ((Cat) cat4).setWild(true);
//
//        if (cat4 instanceof Wolf){
//            Wolf cat5 = (Wolf) cat4;
//        } else{
//            System.out.println("Не явялется волком!");
//        }


        Animal cat6 = new Cat("Персик", "White", 4);
        cat6.voice();

//        Создать набор бассейнов и заставить животных проплыть по ним и вывести время на заплыв


        Cat catCompetitor1 = new Cat("Кот Жорик", "Черный", 7);
        catCompetitor1.setSwimmingSpeed(12);
        Wolf wolfCompetitor1 = new Wolf("Волк Тревор","Серый", 6);
        wolfCompetitor1.setSwimmingSpeed(20);
        Turtle turtleCompetitor1 = new Turtle("Черепаха Халк", "Зеленый", 50);
        turtleCompetitor1.setSwimmingSpeed(10);

        Pool[] pools = {new Pool(100), new Pool(50), new Pool(200)};


        for (Pool pool : pools){
            pool.getTimeToOvercomePool(catCompetitor1);
            pool.getTimeToOvercomePool(wolfCompetitor1);
            pool.getTimeToOvercomePool(turtleCompetitor1);
        }

        Utils.makeAnimalOlder(cat6);
    }

}
