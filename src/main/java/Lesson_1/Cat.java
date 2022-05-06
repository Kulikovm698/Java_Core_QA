package Lesson_1;

import java.util.Objects;

public class Cat extends Animal implements CanSwim {

    private boolean isWild;
    private double swimmingSpeed;

    public Cat(String name, String color, int age) {
        super(name, color, age);

        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Некорректное значение");
        } else {
            this.age = age;
        }
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    /*
     * Переоредили метод equals для сравнения строк (котов).
     * Без переопределения будет false:
     * public boolean equals(Object obj) {
     * return (this == obj);)
     */
    @Override
    public boolean equals(Object o) //сюда передали cat3)//
     {
        if (this == o) return true; //Сравниваем ссылки (this - ссылка на cat2, потому что у cat2 вызвали метод equals)
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }

    public void voice(){
        System.out.println("Кот мяукает");
    }

    public double swim(Pool pool){
        System.out.println(name +  " " + "плывет" + ":" +pool.getLength() / swimmingSpeed + "c" );
        return pool.getLength() / swimmingSpeed;
    }

}
