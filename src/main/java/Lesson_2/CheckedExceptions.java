package Lesson_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class CheckedExceptions {

    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream("KFmkd");
        } catch (FileNotFoundException exception) {
        //    exception.printStackTrace();
        }

        System.out.println("Программа жива!");

    }

}
