package Lesson_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ALotOfException {

    public static void main(String[] args) {
//
//        int x = 0;
//        if (x != 0 & 5 / x > 2){
//            System.out.println("test");
//        }


            try {
                String[] strings = {"Dklsmfdl", "fdkfdm"};
                String strings1 = strings[2];

                test();
                int a = 1 / 0;
                InputStream inputStream = new FileInputStream("dsdsd");
            } catch (FileNotFoundException | ArithmeticException exception) {
/*Throwable плохая практика для отлавливания ошибок потому что отловим все ошибки,
даже те, которые не нужно
 */
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
