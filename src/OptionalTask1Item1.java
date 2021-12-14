public class OptionalTask1Item1 {
    //Метод возвращает значение наибольшей длины элементов в массиве(берем по модулю, чтобы не учитывать знак)
    static Integer getMaxLengthOfArrayElements(Integer[] a){
        int maxLengthOfArrayElements = (String.valueOf(Math.abs(a[0]))).length();
        for (int i = 0; i < a.length; i++) {
            int lengthOfNumber = (String.valueOf(Math.abs(a[i]))).length();
            if (lengthOfNumber > maxLengthOfArrayElements) {
                maxLengthOfArrayElements = lengthOfNumber;


            }
        }
        return maxLengthOfArrayElements;
    }
    //Метод возвращает значение наименьшей длины элементов в массиве (берем по модулю, чтобы не учитывать знак)
    static Integer getMinLengthOfArrayElements(Integer[] a){
        int minLengthOfArrayElements = (String.valueOf(Math.abs(a[0]))).length();
        for (int i = 0; i < a.length; i++) {
            int lengthOfNumber = (String.valueOf(Math.abs(a[i]))).length();
            if (lengthOfNumber < minLengthOfArrayElements) {
                minLengthOfArrayElements = lengthOfNumber;

            }
        }
        return minLengthOfArrayElements;
    }

    public static void main(String[] args) throws OptionalTask1Item7.MyException {
        Integer[] array;
        array= OptionalTask1Item7.generateArray();//Вызываем из OptionalTask1Item7 статический метод генерации массива с консоли
        System.out.print("Inserted array elements:");
        OptionalTask1Item2.printArray(array);//Вызываем из OptionalTask1Item2 статический метод вывода на экран элементов массива
        System.out.println();
        System.out.println("The longest among them are ");
        for (int i = 0; i < array.length; i++){
            int lengthOfNumber = (String.valueOf(Math.abs(array[i]))).length();
            if (lengthOfNumber == getMaxLengthOfArrayElements(array)) {
                System.out.print(" " + array[i]);
            }
        }
        System.out.println();
        System.out.println( " max length is " + getMaxLengthOfArrayElements(array));
        System.out.println();
        System.out.println("The shortest among them are ");
        for (int i = 0; i < array.length; i++){
            int lengthOfNumber = (String.valueOf(Math.abs(array[i]))).length();
            if (lengthOfNumber == getMinLengthOfArrayElements(array)) {
                System.out.print(" " + array[i]);
            }
        }
        System.out.println();
        System.out.println(" min length is " + getMinLengthOfArrayElements(array));

    }
}
