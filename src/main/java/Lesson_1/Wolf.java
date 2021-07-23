package Lesson_1;

public class Wolf extends Animal implements CanSwim {

    private double swimmingSpeed;

    public Wolf(String name, String color, int age) {
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
        System.out.println("Волк воет!");
    }

    public double swim(Pool pool){
        System.out.println(name +  " " + "плывет" + ":" + pool.getLength() / swimmingSpeed + "c" );
        return pool.getLength() / swimmingSpeed;
    }
}
