package Lesson_3;

public class Box {

    private Object object;

    public Box(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Box{" +
                "object=" + object +
                '}';
    }

    public static void main(String[] args) {
        Box box1 = new Box(5);
        Box box2 = new Box(10);
        Box box3 = new Box("Test");

        System.out.println(box1.getObject().getClass());

        //чтобы достать содержимое коробки, нужно всегда вызывать get'еры
        int sum = (Integer) box1.getObject() + (Integer) box2.getObject();
        System.out.println(sum);

        if(box1.getObject() instanceof Integer && box3.getObject() instanceof Integer);
        {
            int sum2 = (Integer) box1.getObject() + (Integer) box3.getObject();
        }
        /*
        instanceof нужно для того, чтобы проверять содержимое коробок. Например, убедиться, что там лежит тип Integer
         */
    }
}
