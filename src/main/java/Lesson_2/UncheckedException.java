package Lesson_2;

public class UncheckedException {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;

/*
 * Так Unchecked не рекомендуется обрабатывать! Лучше сделать проверку!
        try{
            int c = a / b;
        } catch (Exception e){
            System.out.println("Исключение");
        }

*/
        //Вот так Unchecked написать можно. Это проверка. И код нужно писать так, чтобы они были невозможными!
        if(b != 0 ){
            int c = a / b;
        } else {
            System.out.println("Делить на 0 нельзя!");
        }

//        String[] strings = {"Dklsmfdl", "fdkfdm"};
//        String strings1 = strings[2];

    }

}
