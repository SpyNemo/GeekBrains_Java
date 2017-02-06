package geekbrains.java_level_1.lesson_1;




import java.util.Scanner;




public class Main_1 {

    public static Boolean moreOrLess (int x1, int x2){
        return (10 < (x1+x2) && (x1+x2) < 20);
    }

    public static void leapYear (int year){

        System.out.println(((year%4 == 0) && ((year%100 != 0) || (year%400 == 0))));

    }

    public static void main(String[] args) {




/*3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a,b,c,d
– входные параметры этого метода.*/

         Scanner dataInput = new Scanner(System.in);

        System.out.println("Расчет формулы a * (b + (c / d))");

        System.out.print("Введите число a = ");
        int a = dataInput.nextInt();
        System.out.print("Введите число b = ");
        int b = dataInput.nextInt();
        System.out.print("Введите число c = ");
        int c = dataInput.nextInt();
        System.out.print("Введите число d = ");
        int d = dataInput.nextInt();
        int result = a * (b + (c / d));
        System.out.println(result);


/*4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в
    пределах 10 до 20, если да – вернуть true, в противном случае – false.*/

        System.out.println("Введите первое число");
        int x1 = dataInput.nextInt();
        System.out.println("Введите второе число");
        int x2 = dataInput.nextInt();
        System.out.println(moreOrLess(x1, x2));



/*5. * Написать метод, который определяет является ли год високосным. Каждый 4-й год является
    високосным, кроме каждого 100-го, при этом каждый 400-й – високосный. */

        System.out.println("Введите год");
        leapYear(dataInput.nextInt());


        dataInput.close();
    }

}
