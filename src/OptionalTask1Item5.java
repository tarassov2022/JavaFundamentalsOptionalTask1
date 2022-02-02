import java.util.ArrayList;

public class OptionalTask1Item5 {
    static ArrayList<Integer> makeListOfDigitsOutOfNumber(Integer number){ // Метод создает список из цифр целого числа
        ArrayList<Integer> arrayOfDigitsOutOfNumber = new ArrayList<>();
        while (number != 0) { // Создаем список из цифр number путем остатка от деления на 10
            arrayOfDigitsOutOfNumber.add(number % 10);
            number/= 10;
        }
        return arrayOfDigitsOutOfNumber;

    }
    public static void main(String[] args) throws OptionalTask1Item7.MyException {
        int evenDigitsCounter = 0; // кол-во четных цифр в числе
        int oddDigitsCounter = 0; // кол-во нечетных
        int numbersWithEvenDigitsCounter = 0; // итоговое кол-во чисел, состоящих только из четных цифр
        int numberWithEqualEvenAndOddDigitsCounter = 0; // итоговое кол-во чисел, состоящих из равных четных-нечетных
        Integer [] array;
        array= OptionalTask1Item7.generateArray(); //вызываем метод создания массива с консоли из класса OptionalTask1Item7
        int numberOfElements= array.length;

        for (int i = 0; i < numberOfElements; i++) {

            // вызываем метод по созданию списка из цифр элемента array[i] и
            // проверяем каждую цифру на четность и увеличиваем соответствующий счетчик
            // Массив " ArrayList<Integer> makeListOfDigitsOutOfNumber" по сути динамический,
            // задается внутри цикла, чтобы при каждом новом вводимом числе он пересоздавался
            for (int j = 0; j < makeListOfDigitsOutOfNumber(array[i]).size(); j++) {
                if (makeListOfDigitsOutOfNumber(array[i]).get(j) % 2 == 0) evenDigitsCounter++;
                else oddDigitsCounter++;
            }


            if (evenDigitsCounter == makeListOfDigitsOutOfNumber(array[i]).size()) numbersWithEvenDigitsCounter++; // если кол-во четных цифр = кол-ву цифр в чисел это первое условие
            else if (evenDigitsCounter == oddDigitsCounter) numberWithEqualEvenAndOddDigitsCounter++; // а если четные = нечетным - второе

            // обнуляем счетчики
            evenDigitsCounter = 0;
            oddDigitsCounter = 0;


        }

        System.out.println("The number of elements of even digits : " + numbersWithEvenDigitsCounter + "\nThe number of elements where the quantity of even and odd digits is equal  : " + numberWithEqualEvenAndOddDigitsCounter);
    }
        }




