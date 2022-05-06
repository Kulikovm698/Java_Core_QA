package homeWork_2;

public class Main {

    public static void main(String[] args) {

    String [][] successArray = {
            {"5", "8", "9", "4"},
            {"5", "8", "9", "4"},
            {"5", "8", "9", "4"},
            {"5", "8", "9", "4"}
    };

    try {
        System.out.println(arraySum(successArray));
    } catch(MyArraySizeException e){
        e.printStackTrace();
    } catch (MyArrayDataException e){
        e.printStackTrace();
    }


        String [][] unsuccessfulArray = {
                {"5", "8", "9", "4"},
                {"5", "8", "9", "4"},
                {"5", "8", "x", "4"},
                {"5", "8", "9", "4"}
        };

        try {
            System.out.println(arraySum(unsuccessfulArray));
        } catch(MyArraySizeException e){
            e.printStackTrace();
        } catch (MyArrayDataException e){
            e.printStackTrace();
        }

        String[][] ArrayLengthIsNotEqualToFour = {
                {"5", "8", "9", "4","7"},
                {"5", "8", "9", "4","7"},
                {"5", "8", "9", "4","7"},
                {"5", "8", "9", "4","7"},

        };

        try{
            System.out.println(arraySum(ArrayLengthIsNotEqualToFour));
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }catch (MyArrayDataException e){
            e.printStackTrace();
        }
    }



    public static int arraySum (String[][] twoDimensionalArray) throws MyArraySizeException, MyArrayDataException{
        int myArrayLength = 4;
        int myArrayHeight = 4;

        if(twoDimensionalArray.length != myArrayLength ||twoDimensionalArray.length!= myArrayHeight){
            throw new MyArraySizeException("Размер массива не равне 4" + "." + "Размер массива равен " +  myArrayLength +
                    "," +  myArrayHeight );
        }

        for (String[] array: twoDimensionalArray){
            if(array.length != myArrayLength || twoDimensionalArray.length !=myArrayHeight){
                throw new MyArraySizeException("Размер массива не равне 4");
            }
        }

        int sum = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray.length; j++) {
                try {
                    sum += Integer.parseInt(twoDimensionalArray[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("Неверный формат даннных в ячейке"+ " " + i + ", " + j);
                }
            }
        }
        return sum;
    }
}

