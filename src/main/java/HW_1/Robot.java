package HW_1;

public class Robot extends Properties implements Competing {

    public Robot(String name, int jumpHeight, int runLength) {
        super(name, jumpHeight, runLength);
    }

    @Override
    public void jump(int height) {
        if (height > jumpHeight) {
            System.out.println(name + " " + " не смог перепрыгнуть");
        } else {
            System.out.println(name + " " + "смог перепрыгнуть");
        }
    }

    @Override
    public void run(int length) {
        if (length > runLength) {
            System.out.println(name + " " + " не смог пробежать");
        } else {
            System.out.println(name + " " + "смог пробежать");
        }


    }
