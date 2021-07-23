package Lesson_1;

public class Turtle extends Animal implements CanSwim {

    private double swimmingSpeed;

    public Turtle(String name, String color, int age) {
        super(name, color, age);
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void voice() {
        System.out.println("Черепаха издает звуки!");
    }

    public double swim(Pool pool){
        System.out.println(name +  " " + "плывет" + ":" + pool.getLength() / swimmingSpeed + "c" );
        return pool.getLength() / swimmingSpeed;
    }
}
