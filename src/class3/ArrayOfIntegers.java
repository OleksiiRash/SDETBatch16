package class3;

public class ArrayOfIntegers {
    public static void main(String[] args) {

        /*
        Write a program that creates an array of integers and stores the following values: 45, 78, 12,  67, 55 and then prints all array values.
        Output:
        45 78 12 67 55
         */
        int[] numberArrays = {45, 78, 12, 67, 55};

        /* launch a loop that start from 0 and ends of the array length
       for (initialization; condition; update):
       initialization: int i = 0; - это просто мы указываем с какого значения начинать проверку
       condition: i < myArray.length; - это выражение позволяет нам указать что мы проверяем все значения в цикле
       update: i++; - это говорить что мы повторяем и проверяем каждое значение
        */

        for (int i = 0; i < numberArrays.length; i++) {
            System.out.print(numberArrays[i] + " ");
        }

        String divider = " ";
        System.out.println(divider);

        int[] numbers = {1, 2, 3, 4, 5};

        // more examples with this condition: i < 5; instead of this: i < numberArrays.length;

        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " "); // inappropriate // "alt + enter" to fix the mistake in text or code
        }


    }
}

