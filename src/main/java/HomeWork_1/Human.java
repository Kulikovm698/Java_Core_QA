package HomeWork_1;

public class Human extends Properties {

    public Human(String name, int jumpHeight, int runLength) {
        super(name, jumpHeight, runLength);
    }
//
//    @Override
//    public void jump(int height) {
//        if (height <= jumpHeight) {
//            System.out.println(name + " " + "Большая высота, не смог перепрыгнуть");
//        } else {
//            System.out.println(name + " " + "Смог перепрыгнуть");
//        }
//    }
//
//    @Override
//    public void run(int length) {
//        if (length <= runLength) {
//            System.out.println(name + " " + "Большая длина, не смог пробежать");
//        } else {
//            System.out.println(name + " " + "Смог пробежать");
//        }
//    }

    @Override
    public void jump(int height) {
        super.jump(height);
    }

    @Override
    public void run(int length) {
        super.run(length);
    }
}
