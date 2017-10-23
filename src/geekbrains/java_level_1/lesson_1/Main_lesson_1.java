package geekbrains.java_level_1.lesson_1;
import java.util.Scanner;

//1. Создать пустой проект в IntelliJ IDEA и прописать метод main();


//4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в
//    пределах 10 до 20, если да – вернуть true, в противном случае – false.
//5. * Написать метод, который определяет является ли год високосным. Каждый 4-й год является
//    високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.



public class Main_lesson_1 {


    public static void Calcultion (double a, double b, double c, double d) {

        double res = a * (b + (c / d));
        System.out.println("Сумма ...." + res);
    }

    public static void main (String[] args) {


//2. Создать переменные всех пройденных типов данных, и инициализировать их значения;

        byte bt = 110;
        short sh = 30000;
        int i = 2198765;
        float f = 17.3f;
        double doub = 17.3d;
        boolean bool = true;
        char ch = 'C';



//3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a,b,c,d – входные параметры этого метода.

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число a = ");
        double a = sc.nextDouble();
        System.out.println("Введите число b = ");
        double b = sc.nextDouble();
        System.out.println("Введите число c = ");
        double c = sc.nextDouble();
        System.out.println("Введите число d = ");
        double d = sc.nextDouble();

        Calcultion(a,b,c,d);




    }


}
