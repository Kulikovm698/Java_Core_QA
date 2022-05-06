package Lesson_2;

import java.io.FileNotFoundException;

public class CalculateSquare {

    public static void main(String[] args) {

            calcRectangleSquare(-1, 9);

        System.out.println("Программа жива!");
    }

    public static int calcRectangleSquare (int sideA, int sideB) throws OneOrBothRectangleSidesNegativeException {
        if (sideA <= 0 || sideB <= 0){
            //System.out.println("Одна из сторон с отрицательным значением");

            throw new OneOrBothRectangleSidesNegativeException("Одна из стороно отрицательная: " + sideA + ", " + sideB);
        }
        return sideA * sideB;
    }

}
