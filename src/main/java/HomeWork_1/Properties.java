package HomeWork_1;

public class Properties implements Competing {

    protected String name;
    protected int jumpHeight;
    protected int runLength;

    public Properties(String name, int jumpHeight, int runLength) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    public void jump(int height) {
        if (height >= jumpHeight ) {
            System.out.println(name + " - " + "Большая высота, не смог перепрыгнуть");
        } else {
            System.out.println(name + " - " + "Смог перепрыгнуть");
        }
    }

    public void run(int length) {
        if (length >= runLength) {
            System.out.println(name + " - " + "Большая длина, не смог пробежать");
        } else {
            System.out.println(name + " - " + "Смог пробежать");
        }
    }
}
