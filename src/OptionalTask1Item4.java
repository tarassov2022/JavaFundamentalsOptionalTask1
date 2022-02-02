import java.util.HashSet;

public class OptionalTask1Item4 {
    //Создаем статический метод , который оставляет в элементах массива только уникальные цифры
    static String[] makeArrayOfElementsWithUniqueDigits(Integer[] array){
        String [] arrayOfElementsWithUniqueDigits = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            HashSet<Character> hashSet = new HashSet<>();
            for (Character character : String.valueOf(Math.abs(array[i])).toCharArray()) {//По модулю чтобы не кидать в набор знак у отрицательных элементов
                hashSet.add(character);
            }
            arrayOfElementsWithUniqueDigits[i] = hashSet.toString();
        }
     return arrayOfElementsWithUniqueDigits;
    }

    public static void main(String[] args) throws OptionalTask1Item7.MyException {
        Integer [] array;
        array= OptionalTask1Item7.generateArray(); //вызываем метод создания массива с консоли из класса OptionalTask1Item7
        String[] arrayOfElementsWithUniqueDigits;
        arrayOfElementsWithUniqueDigits= makeArrayOfElementsWithUniqueDigits(array);// Обрабатываем массив, получая массив в котором элементы содержат только уникальные цифры
        System.out.println("The shortest number of different digits have the following elements:  ");
        int shortestLengthOfNumber = arrayOfElementsWithUniqueDigits[0].length();
        //Находим самое короткое число различных цифр среди элементов массива (через обработанный массив arrayOfElementsWithUniqueDigits)
        for (int i = 0; i < array.length; i++) {
            int lengthOfNumber = arrayOfElementsWithUniqueDigits[i].length();
            if (lengthOfNumber < shortestLengthOfNumber) {
                shortestLengthOfNumber = lengthOfNumber;

            }
        }
        //Печатаем те элементы массива, у которых число цифр соответствует этому числу
        //Поскольку элемент arrayOfElementsWithUniqueDigits содержит скобки, пробелы, запятые, то его длина не может быть равна соответствующему элементу array[]
        //Поэтому фактически находим просто индекс элемента arrayOfElementsWithUniqueDigits, а печатаем уже соответствующий элемент array
        for (int i = 0; i < array.length; i++){
            int lengthOfNumber = arrayOfElementsWithUniqueDigits[i].length();
            if (lengthOfNumber == shortestLengthOfNumber) {
                System.out.print(" " + array[i]);
            }
        }


    }
}





