package HW_1;

public class Wall implements Overcomeble{

    public int  height;

    public Wall(int height) {
        this.height = height;
    }

    public void overcome(Competing competing){
        competing.jump(height);
    }

}
