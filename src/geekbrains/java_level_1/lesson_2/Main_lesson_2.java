package geekbrains.java_level_1.lesson_2;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ];
2 В массиве из предыдущего пункта, с помощью цикла и условия заменить 0 на 1, 1 на 0;
3 Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 1 4 7 10 13 16 19 22;
4 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
5 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
6 ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
7 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
        Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят.
8 ** Написать простой консольный калькулятор. Пользователь вводит два числа и операцию, которую хочет выполнить, программа вычисляет результат и выводит в консоль;
*/




public class Main_lesson_2 {




// 1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ];
    public static int[] simple_array (int ar_size){

        int[] s_array = new int[ar_size];

        Random generator = new Random();

        for (int i = 0; i < ar_size; i++) {
          s_array[i] = generator.nextInt(2);
        }

        return s_array;

     }

// 2 В массиве из предыдущего пункта, с помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static int[] invert_array (int in_s_array[]){

         for (int i = 0; i < in_s_array.length ; i++) {
             switch (in_s_array[i]){
                 case 0: in_s_array[i] = 1;
                    break;

                 case 1: in_s_array[i] = 0;
                     break;

                 default:
                     System.out.println("Element is out of range");
             }

         }
            return in_s_array;

    }

// 3 Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 1 4 7 10 13 16 19 22;
    public static void fixed_array (){
        int[] fix_arr = new int[8];
        int j = 1;
        for (int i = 0; i < fix_arr.length ; i ++) {
            fix_arr[i] = j;
            j = j +3;
        }

        System.out.println("Fixed array  of 8 elements: " + Arrays.toString(fix_arr));
    }

// 4 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void not_less_than_six (){

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Fixed array  with elements less 6                     : " + Arrays.toString(arr));

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }


        System.out.println("Fixed array with elements less than 6 multiplied by 2 : " + Arrays.toString(arr));

    }

// 5 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void two_dim_array_w_dia (int ar_size){

        Random generator = new Random();
        int[][] arr = new int[ar_size][ar_size];

        System.out.println("2 Dim array: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = generator.nextInt(98);
                if (i == j){
                    arr[i][j] = 1;
                }
            }

        }
        System.out.println(Arrays.deepToString(arr).replace("], ", "]\n"));

    }

// 6 ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
public static void min_max_array (int ar_size){
    Random generator = new Random();

    int min, max, range;
    range = 98;
    min = range;
    max = 0;


    int[] s_array = new int[ar_size];
    for (int i = 0; i < s_array.length; i++) {
        s_array[i] = generator.nextInt(range);
//        if  (i == 0) min = max = s_array[i];
        if (s_array[i] < min) min = s_array[i];
        if (s_array[i] > max) max = s_array[i];

        }

    System.out.println("Original array for MIN and MAX : " + Arrays.toString(s_array));
    System.out.println("MIN = " + min + "; \t" + "MAX = " + max);
    }




//=============== MAIN ==============================
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


// 1. ==========================
        System.out.println("Task 1");
        System.out.println();
        System.out.print("Size of array :  ");
        int ar_size = input.nextInt();
        int arr[] =  simple_array(ar_size);
        System.out.println("Original array2: " + Arrays.toString(arr));
        System.out.println();
// 2. ==========================
        System.out.println("Task 2");
        System.out.println();
        invert_array(arr);
        System.out.println("Inverted array : " + Arrays.toString(arr));
        System.out.println();
// 3. ==========================
        System.out.println("Task 3");
        System.out.println();
        fixed_array();
        System.out.println();
// 4. ==========================
        System.out.println("Task 4");
        System.out.println();
        not_less_than_six();
        System.out.println();
// 5. ==========================
        System.out.println("Task 5");
        System.out.println();
        System.out.print("Size of 2Dim array :  ");
        ar_size = input.nextInt();
        two_dim_array_w_dia(ar_size);
        System.out.println();
// 6. ==========================
        System.out.println("Task 6");
        System.out.println();
        min_max_array(ar_size);
        System.out.println();
// 7**. ==========================


// 8**. ==========================


    }



}
