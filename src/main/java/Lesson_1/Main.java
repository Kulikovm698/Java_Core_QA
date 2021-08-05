package Lesson_1;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Vasya", "Grey", 5);
        Cat cat2 = new Cat("Dan", "Black", 1);
        Cat cat3 = new Cat("Dan", "Black", 1);

        System.out.println(cat2.equals(cat3));

        Wolf wolf = new Wolf("Тревор","Серый", 6);

        Animal cat4 = new Cat("Dan", "Black", 1);
    }

}
