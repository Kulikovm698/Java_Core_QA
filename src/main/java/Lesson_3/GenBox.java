package Lesson_3;

import java.util.ArrayList;
import java.util.List;

public class GenBox<T> { //T, U, V, W
    //Параметризация типов
    private T object;

    public GenBox(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

//    public static T test (){ // в статических методах не можем испольховать джинерики или в статических переменных
//        return T;
//    }

    //    public void test2 (){   не гарантируется наличие конструктора
//        T test = new T();
//    T[] array = new T[10];
//    }

    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "GenBox{" +
                "object=" + object +
                '}';
    }

    public static void main(String[] args) {

        GenBox<Integer> integerGenBox1 = new GenBox<>(5);
        GenBox<Integer> integerGenBox2 = new GenBox<>(10);

        System.out.println("Класс генбокса с целым числом: " + integerGenBox1.getClass());

        System.out.println(integerGenBox1.getObject() + integerGenBox2.getObject());

        GenBox<String> stringGenBox = new GenBox<>("Test");

        GenBox genBox = new GenBox(8); // хранится объект типа object

        Integer a = new Integer(5);
        Number b = a;

        List<Integer> integerArrayList = new ArrayList<>();
//        ArrayList<Number> numberArrayList = integerArrayList;
    }
}
