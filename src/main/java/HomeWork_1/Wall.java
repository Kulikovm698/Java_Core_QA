package HomeWork_1;

public class Wall implements Overcomable{

    public int height;

    public Wall(int height) {
        this.height = height;
    }

    public void overcome(Competing competing) {
        competing.jump(height);
    }
}
