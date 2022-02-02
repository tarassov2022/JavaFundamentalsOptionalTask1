public class OptionalTask1Item6 {
    public static void main(String[] args) throws OptionalTask1Item7.MyException {
        Integer [] array;
        array= OptionalTask1Item7.generateArray(); //вызываем метод создания массива с консоли из класса OptionalT1Item7
        int sizeOfArray= array.length;
        int counterOfCases = 0;

        for (int i = 0; i < sizeOfArray; i++) {
          // Вызываем метод makeListOfDigitsOutOfNumber класса OptT15 создания списка из цифр элемента массива array[i]
            Integer numberWithIncrementingDigits = array[i];
            for (int j = 0; j < OptionalTask1Item5.makeListOfDigitsOutOfNumber(array[i]).size()-1; j++) {
               if (Math.abs(OptionalTask1Item5.makeListOfDigitsOutOfNumber(array[i]).get(j)) > Math.abs(OptionalTask1Item5.makeListOfDigitsOutOfNumber(array[i]).get(j+1))) {counterOfCases++;} // Сравниваем наоборот, т.к. список заполняется с последней до первой цифры и по модулю, если будут введены отрицательные элементы
            }
            if ((counterOfCases == OptionalTask1Item5.makeListOfDigitsOutOfNumber(array[i]).size()-1) & counterOfCases>0) { // Исключаем однозначные элементы, т.к. возрастание требуется строгое
                System.out.println("The first number with incrementing digits is " + numberWithIncrementingDigits );
               break;}
            else counterOfCases = 0;
        }
        if (counterOfCases==0) {
            System.out.println("The numbers with incrementing digits are absent!");
        }
    }
}
