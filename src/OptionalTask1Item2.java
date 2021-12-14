public class OptionalTask1Item2 {

        public static void main(String[] args) throws OptionalTask1Item7.MyException {
            System.out.println("The array sorted by incrementing of its elements length: ");
            printArray(getArrayBubbleSortedByIncrementingOfElementsLength(OptionalTask1Item7.generateArray()));//Вызываем статические методы генерации массива с консоли, сортировки его по возрастанию длины элементов и печатающие массив
        }

        //Метод возвращает отсортированный массив по длине элементов методом пузырька
        static  Integer[] getArrayBubbleSortedByIncrementingOfElementsLength(Integer[] array) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i=0; i< array.length-1; i ++){
                //Сравниваем по модулю, чтобы - у отрицательных элементов не учитывался в их длину
                 if ((String.valueOf(Math.abs(array[i])).length() > (String.valueOf(Math.abs(array[i+1])).length()))) {
                    int swapElement = array[i];
                    array[i] = array[i+1];
                    array[i+1] = swapElement;
                    sorted = false;}
            }
        }
        return array;
        }
    //Метод печатает элементы массива
        static void printArray (Integer[] array){
            System.out.println();
        for (int j=0; j< array.length; j++){
            System.out.print(array[j]+" ");}
       }

}
