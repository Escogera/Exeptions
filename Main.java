public class Main {
    public static void main(String[] args) {

    }
    
    // 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    public static int[] createArray(int size) {
        if (size < 0) {
            throw new NegativeArraySizeException("Размер массивы не может быть отрицательным!");
        }
        return new int[size];
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо!");
        }
        return a / b;
    }


    public static int getValue(int[] array, int index) {
        if (index > array.length) {
            throw new IndexOutOfBoundsException("Индекс не может быть пределами массива!");
        }
        return array[index];
    }



// 2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?


public class Method {

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    // a) Если в дву мерном массиве будут не целочисленные значения, буквы, символы или null
    // b) Если суммарное число будет больше 2 147 483 647 или меньше -2147483647
    // c) Если передать не коректный по размерам двумерный массив
    // (Если arr.length будет больше или меньше 5)

    

// 3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов 
// двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя.


    public static int[] diffArray(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new RuntimeException("Длины массивов не равны!");
        }
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] + b[i];
        }
        return result;
    }

// 4. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//    и возвращающий новый массив, каждый элемент которого равен частному 
//    элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, 
//    необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное
//    исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

    public static int[] divideArray(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new RuntimeException("Длины массивов не равны!");
        }
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0)
                throw new RuntimeException("Деление на нуль не допустимо!");
            result[i] = a[i] / b[i];
        }
        return result;
    }

}
}