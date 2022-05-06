package Lesson_2;

/*

 Стек (призван хранить данные и обрабатывать их определенным образом) - структура данных, которая

Исключения - так же явялются объектами (классы). Генерация исключения - это создание объекта класса.


 */

public class Main {

    public static void main(String[] args) {

        test();
        System.out.println("Метод Main");

    }

    public static void test() {

        test1();
        System.out.println("Метод test");
    }

    public static void test1() {

        test2();
        System.out.println("Метод test1");
    }

    public static void test2() {

         int a = 1 / 0;

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for(StackTraceElement stackTraceElement : stackTraceElements){
            System.out.println(stackTraceElement.getMethodName() + " " + stackTraceElement.getLineNumber());
        }

        System.out.println("Метод test2");

    }

}
