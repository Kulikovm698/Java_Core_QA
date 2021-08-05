package HW_1;

public class RoadRun implements Overcomeble {

    public int length;

    public RoadRun(int length) {
        this.length = length;
    }

    public void overcome (Competing competing){
        competing.run(length);
    }
}
