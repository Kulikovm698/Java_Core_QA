package Lesson_3;

import java.util.Arrays;

public class NumbersBox<T extends Number> {

    private T[] array;

    public NumbersBox(T... array) {
        this.array = array;
    }

    public double calcAverage() {
        double sum = 0.0;
        for (T num : array) {
            sum = sum + num.doubleValue();
        }
        return sum / array.length;
    }

    public T[] getArray() {
        return array;
    }

    public boolean isSameAvg(NumbersBox<?> boxToCompare) {  //? - wildcard
        return calcAverage() == boxToCompare.calcAverage();
//        return Math.abs(calcAverage() - boxToCompare.calcAverage()) < 0.0001; - для расчета по модулю чисел с плавающей точкой
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public static <U extends Number> U getFirstElement(NumbersBox<U> numbersBox){
        return numbersBox.getArray()[0];
    }

    @Override
    public String toString() {
        return "NumbersBox{" +
                "array=" + Arrays.toString(array) +
                '}';
    }


    public static void main(String[] args) {
        NumbersBox<Integer> integerNumbersBox1 = new NumbersBox<>(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(integerNumbersBox1.calcAverage());

        NumbersBox<Integer> integerNumbersBox2 = new NumbersBox<>(2, 34, 545, 234, 5452);
        System.out.println(integerNumbersBox1.isSameAvg(integerNumbersBox2));

        NumbersBox<Double> doubleNumbersBox1 = new NumbersBox<>(1.0, 2.3, 4.0, 3.5);
        System.out.println(integerNumbersBox1.isSameAvg(doubleNumbersBox1));

        NumbersBox<Double> doubleNumbersBox2 = new NumbersBox<>(1.0, 2.3, 4.0, 3.5);
        doubleNumbersBox1.isSameAvg(doubleNumbersBox2);

        System.out.println(getFirstElement(doubleNumbersBox1));
    }
}
