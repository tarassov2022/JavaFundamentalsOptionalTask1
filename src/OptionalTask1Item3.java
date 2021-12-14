public class OptionalTask1Item3 {
    //Метод возвращает среднюю длину элементов массива
    static Double getAverageLengthOfArrayElements(Integer[] array) {
        double averageLengthOfArrayElement=0;
        for (int i = 0; i < array.length; i++) {
            averageLengthOfArrayElement = averageLengthOfArrayElement + String.valueOf(Math.abs(array[i])).length();//Берем по модулю, чтобы не учитывать - у отрицательных
        }
        averageLengthOfArrayElement = averageLengthOfArrayElement / array.length;
        return averageLengthOfArrayElement;
    }

    public static void main(String[] args) throws OptionalTask1Item7.MyException {
        Integer[] array;
        array= OptionalTask1Item7.generateArray();//Вызываем из OptionalTask1Item7 статический метод генерации массива с консоли
        int arrayElementsWithLengthExceedingAverageCounter=0;
        System.out.println("Array elements average length: " + getAverageLengthOfArrayElements(array));
        System.out.println("Array elements with length exceeding the average: ");
        for (int i = 0; i < array.length; i++) {
            if ((String.valueOf(Math.abs(array[i]))).length() > getAverageLengthOfArrayElements(array)) {
                arrayElementsWithLengthExceedingAverageCounter++;
                System.out.println(array[i] + "  length=" + String.valueOf(Math.abs(array[i])).length());
            }
        }
        if (arrayElementsWithLengthExceedingAverageCounter>0){
            System.out.println("There are  "+ arrayElementsWithLengthExceedingAverageCounter+ " of such elements among "+array.length);
        }
        else {System.out.println("No such elements! ");}
    }
}
