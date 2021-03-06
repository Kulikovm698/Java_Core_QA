package Lesson_1;

public class Pool {
    private int length;

    public Pool(int length) {
        this.length = length;
    }

    public int getLength(){
        return length;
    }

    public void setLength(int length){
        this.length = length;
    }

    public double getTimeToOvercomePool(CanSwim swimmer){
        return swimmer.swim(this);
    }
}
