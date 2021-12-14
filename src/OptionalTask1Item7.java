import java.util.InputMismatchException;
import java.util.Scanner;

public class OptionalTask1Item7 {
    // Класс собственных исключений
    static class MyException extends Exception {
        String nameOfException;
        MyException(String nameOfException){
            this.nameOfException =nameOfException;
            System.out.println(nameOfException);
            System.exit(0);
        }
    }
    // Метод создает массив array из элементов вводимых с консоли.
    // Предусмотрены случаи неверных введенных значений
    static Integer[] generateArray() throws MyException {
        int numberOfElements=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number of elements:");
        try {
             numberOfElements = scanner.nextInt(); // Читаем с клавиатуры размер массива и записываем в numberOfElements
              if (numberOfElements<=0) {throw new MyException("The number of elements should be positive!");
        }
        }

        catch (InputMismatchException e) {
            System.out.println("\n The wrong format of the number of elements! Description: " + e);
            System.exit(0);
        }
        Integer[] array = new Integer[numberOfElements];
        System.out.println("Insert array elements:");

        for (int i = 0; i < numberOfElements; i++) {
            try {
            array[i] = scanner.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры

        }
            catch (InputMismatchException e) {
                System.out.println("\n The wrong format of  element! Description: " + e);
                System.exit(0);
            }
        }

        return array;


    }
    public static void main(String[] args) throws MyException {
        Integer [] array;
        array= generateArray(); // вызывем метод для создания массива
        String[] arrayOfElementsWithUniqueDigits;
            //Вызываю статический метод из класса OptT14, который оставляет в элементах массива только уникальные цифры
            arrayOfElementsWithUniqueDigits= OptionalTask1Item4.makeArrayOfElementsWithUniqueDigits(array);
            // Делю на 3 размер элемента arrayOfElementsWithUniqueDigits, учитывая что он содержит скобки пробелы и запятые
            System.out.println("The non repeating digits have the following elements:  ");
            for (int i = 0; i < array.length; i++) {
                if ((String.valueOf(Math.abs(array[i])).length()) == (arrayOfElementsWithUniqueDigits[i].length()) / 3) { // Сравниваю длину, чтобы определить повторялись ли цифры(по модулю чтобы не считать знак)
                    System.out.println(array[i]); //если цифры элемента не повторялись, то печатаю этот элемент
                }
            }




    }
}

