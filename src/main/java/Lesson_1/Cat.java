package Lesson_1;

public class Cat {

    public String name;
    public String color;
    public int age;

    public Cat(String name, String color, int age) {
        if(age < 0){
            System.out.println("Вы задаете отрицательный возраст коту!");
        }else {
            this.age = age;
        }
        this.name = name;
        this.color = color;

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
