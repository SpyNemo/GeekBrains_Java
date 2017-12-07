package geekbrains.java_level_1.lesson_1;
import java.util.Scanner;

//1. Создать пустой проект в IntelliJ IDEA и прописать метод main();

public class Main_lesson_1 {


    public static float Calculation () {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число a = ");
        float a = sc.nextFloat();
        System.out.println("Введите число b = ");
        float b = sc.nextFloat();
        System.out.println("Введите число c = ");
        float c = sc.nextFloat();
        System.out.println("Введите число d = ");
        float d = sc.nextFloat();

        System.out.print("Сумма = ");

        return a * (b + (c / d));
    }

    private static boolean InRange (int x,int y){

        int sum = x + y;
        return sum < 20 && sum > 10;

    }

    public static boolean LeapYear(int year) {

        return (year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0);

    }

    public static void main (String[] args) {


//2. Создать переменные всех пройденных типов данных, и инициализировать их значения;

        byte bt = 110;
        short sh = 30000;
        int i = 2198765;
        float flt = 17.3f;
        double dbl = 17.3d;
        boolean bool = true;
        char ch = 'C';



//3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a,b,c,d – входные параметры этого метода.



        System.out.println(Calculation());



//4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах 10 до 20, если да – вернуть true, в противном случае – false.

        System.out.println(InRange(5,6));

//5. * Написать метод, который определяет является ли год високосным. Каждый 4-й год является
//    високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

        System.out.println(LeapYear(2016));
        System.out.println(LeapYear(2017));


    }


}
