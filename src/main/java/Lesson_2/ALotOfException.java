package Lesson_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ALotOfException {

    public static void main(String[] args) {

        try {
            String[] strings = {"Dklsmfdl", "fdkfdm"};
            String strings1 = strings[2];

            test();
            int a = 1 / 0;
            InputStream inputStream = new FileInputStream("dsdsd");
        } catch (FileNotFoundException | ArithmeticException exception) { // Throwable плохая практика для отлавливания ошибок
            exception.printStackTrace();
        } catch (StackOverflowError error) { // error-ы также не принято обрабатывать
            error.printStackTrace();
        } finally {
            System.out.println("Программа все рано выполнилась");
        }

        System.out.println("Программа жива!");

    }

    public static void test() {
        test();
    }

}
