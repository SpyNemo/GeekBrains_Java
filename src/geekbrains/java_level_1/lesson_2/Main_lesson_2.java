package geekbrains.java_level_1.lesson_2;
import java.lang.reflect.Array;
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

    public static void formalization_begin(int task_num){
        System.out.println();
        System.out.println("=============================================================================");
        System.out.println("====================Задача №" + task_num + "===============================================");
    }
    public static void formalization_end(){
        System.out.println();
        System.out.println();
    }



// 1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ];
    public static int[] simple_array (int ar_size){

        int[] s_array = new int[ar_size];

        Random generator = new Random();

        for (int i = 0; i < ar_size; i++) {
          s_array[i] = generator.nextInt(2);
        }
        System.out.println("Original array: " + Arrays.toString(s_array));
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

        System.out.println("Inverted array : " + Arrays.toString(in_s_array));
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
        System.out.println("Fixed array  with elements less than 6                 : " + Arrays.toString(arr));

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

                if ((i == j) || (i==(arr.length-j-1))){
                    arr[i][j] = 1;
                }
            }

        }
        System.out.println(Arrays.deepToString(arr).replace("], ", "\t]\n").replace(",","\t").replace("[[","[").replace("]]","\t]"));

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

// 7 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
//      Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят.
    public static void equal_parts (int[] arr){

        int left_part, right_part, mid;
        left_part = right_part = mid = 0;


        if (arr.length > 2) {

            for (int i = 1; i < arr.length+1; i++) {

                for (int j = 0; j < i; j++) {
                    left_part += arr [j];
//                    System.out.println("left   " + i + "   " + j + "  " + left_part);

                }

                for (int j = 0+i; j < arr.length; j++) {
                    right_part += arr[j];
//                    System.out.println("right  "  + i + "   " + j + "  " + right_part);

                }


            if (left_part == right_part) {


                System.out.println(left_part + "  " + right_part);
                    System.out.println(Arrays.toString(arr));

                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j] + "\t");
                        if (j == i-1) System.out.print("||\t");

                }
                break;

                }

                left_part = right_part = 0;
                System.out.println();

            }


        }
        else System.out.println("Array is too small.");

    }




// 8 ** Написать простой консольный калькулятор. Пользователь вводит два числа и операцию, которую хочет выполнить, программа вычисляет результат и выводит в консоль;
    public static double calculator (){

        double result = 0;


        return result;

    }


//=============== MAIN ==============================
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

/*
// 1. ==========================
        formalization_begin(1);
        System.out.print("Size of array :  ");
        int ar_size = input.nextInt();
        int arr[] =  simple_array(ar_size);
        formalization_end();
// 2. ==========================
        formalization_begin(2);
        invert_array(arr);
        formalization_end();
// 3. ==========================
        formalization_begin(3);
        fixed_array();
        formalization_end();
// 4. ==========================
        formalization_begin(4);
        not_less_than_six();
        formalization_end();
// 5. ==========================
        formalization_begin(5);
        System.out.print("Size of 2Dim array :  ");
        ar_size = input.nextInt();
        two_dim_array_w_dia(ar_size);
        formalization_end();
// 6. ==========================
        formalization_begin(6);
        min_max_array(ar_size);
        formalization_end();*/
// 7**. ==========================
        formalization_begin(7);
        int[] test_arr = {0,1,0,1,0,1,1,0,0,0,0,0,0,0,0,0,2,0};

        equal_parts (test_arr);
        formalization_end();
// 8**. ==========================
        formalization_begin(8);

        formalization_end();
    }



}
