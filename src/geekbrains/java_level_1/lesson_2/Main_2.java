package geekbrains.java_level_1.lesson_2;  // v.0.2 with remarkes fix


public class Main_2 {


// ------------------------------------------------------------------------------------------
// Вывод в консоль 1D массива
    private static void printOut1DArr (int[] prtout){

        for (int i=0; i<prtout.length; i++) System.out.print(prtout[i] + "\t ");

        System.out.println();
        System.out.println();
    }


// Вывод в консоль 1D массива для задания 7
    private static void printOut1DArrPartly (int[] prtout, int midInd){

        for (int i = 0; i < midInd; i++) System.out.print(prtout[i] + "\t ");
        System.out.print("||    ");
        for (int i = midInd; i < prtout.length ; i++) System.out.print(prtout[i] + "\t ");

        System.out.println();
        System.out.println();
    }


// Вывод в консоль 2D массива
    private static void printOut2DArr (int[][] prtout) {

        for (int i = 0; i < prtout.length; i++) {
            for (int j = 0; j < prtout[0].length; j++) {
                System.out.print(prtout[i][j] + "\t ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }

// Проверка точки баланса сумм частей массива
    private static void checkBalance (int[] innerArr) {

        for (int i = 1; i < innerArr.length-1; i++) {

            if (arrSum(innerArr, i)) {
                printOut1DArrPartly(innerArr, i);
                break;
            }
            if (i == innerArr.length - 2) System.out.println("Точка равновесия не найдена!");
        }





    }

// подсчет суммы элементов массива
    private static boolean arrSum(int[] inputArr, int startIndex) {

        int rightSumm = 0, leftSumm = 0;

        for (int i = startIndex; i < inputArr.length; i++) {
            rightSumm = rightSumm + inputArr[i];
        }
        for (int i = 0; i < startIndex; i++) {
            leftSumm = leftSumm + inputArr[i];
        }
        return leftSumm == rightSumm;
}


//2.
    private static void reverse (int[] rev_array){

        for (int i=0; i<rev_array.length; i++) {
            if (rev_array[i] == 1) rev_array[i] = 0;
            else rev_array[i] = 1;
        }
    }

// ------------------------------------------------------------------------------------------

    public static void main(String[] args){

//1. Создать массив, состоящий из элементов 0 и 1, например, int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

//2. В массиве из предыдущего пункта с помощью цикла заменить 0 на 1, 1 на 0;

        reverse(arr);
        printOut1DArr(arr);



/* 2.Old version

        for (int i=0; i<10; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println();

*/


//3. Создать массив из 8 целых чисел. С помощью цикла заполнить его значениями 1 4 7 10 13 16 19 22;

        int[] arr2 = new int [8];
        for (int a = 0, b = 1; a < 8; a++, b = b+3) {
            arr2[a] = b;
        }
        printOut1DArr(arr2);




// 4 Задать массив[1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1] пройти по нему циклом,и числа меньшие 6 умножить на 2;

        int[] arr3  = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int c = 0; c < arr3.length; c++) {

            if (arr3[c] < 6) arr3[c] = arr3[c] * 2;
            System.out.print(arr3[c] + " ");

        }
        printOut1DArr(arr3);




// 5 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//   и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        // так как больше нигде в программе не используется создание такого масиива,
        // то в отдельный класс не стал выносить

        int counter = 1;
        int[][] table = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = counter;
                counter++;
            }
        }

        printOut2DArr(table);

        for (int d = 0; d < 4; d++) {
            table[d][d] = 1;}

        printOut2DArr(table);


        /* Old verion
        int counter = 1;
        int[][] table = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + "\t ");
                counter++;
            }
            System.out.println();}

        System.out.println();

        for (int d = 0; d < 4; d++) {
            table[d][d] = 1;}

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

            System.out.print(table[i][j] + "\t ");
            }
            System.out.println();}
        System.out.println();
*/





// 6 ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        // использую массивы созданные в предыдущих примерах

        int max = arr3[0], min = arr3[0];
        for (int x = 0; x < (arr3.length-1); x++) {
            
            if (arr3[x] > arr3[x+1] && arr3[x] > max) max = arr3[x];
            else {
                if (arr3[x] < arr3[x+1] && arr3[x] < min) min = arr3[x];
            }

            
        }
        System.out.println("max " + max + " " + "min " + min + " ");




/*
 7 ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        метод должен вернуть true если в массиве есть место, в котором сумма левой и
        правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
        checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true, граница показана
        символами ||, эти символы в массив не входят.
*/


        int[] arr4  = {1, 5, 3, 2, 11, 4, 5, 2, 11};
        checkBalance(arr4);
    }


}