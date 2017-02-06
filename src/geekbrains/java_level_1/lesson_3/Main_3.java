package geekbrains.java_level_1.lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Main_3 {

    private static char[][] map = new char[3][3]; // игровое поле
    private static Scanner sc = new Scanner(System.in); // Scanner для чтения консоли
    private static Random rand = new Random(); // генератор случайных чисел

    public static void initMap() { // инициализируем массив map(игровое поле)
        for (int i = 0; i < 3; i++) { // двойным циклом проходимся по всему массиву
            for (int j = 0; j < 3; j++) {
                map[i][j] = '*'; // и заполняем каждую ячейку *
            }
        }
    }

    public static void printMap() { // выводим игровое поле в консоль
        System.out.println("0 1 2 3"); // первая строка с координатами
        for (int i = 0; i < 3; i++) { // начинаем печатать поле
            System.out.print((i + 1) + " "); // ставим номер строки 1-3
            for (int j = 0; j < 3; j++) { // начинаем печатать строку
                System.out.print(map[i][j] + " "); // посимвольно печатаем содержимое каждой ячейки поля
            }
            System.out.println(); // после распечатки строки, делаем перевод каретки
        }
        System.out.println(); // делаем дополнительный перевод строки
    }

    public static void main(String[] args) {
        initMap(); // инициализируем поле
        printMap(); // печатаем в консоль

        while (true) { // запускаем игровой цикл
            humanTurn(); // ход человека
            printMap(); // печать поля
            if (checkWin('X')) { // проверка победы человека
                System.out.println("Победил игрок");
                break;
            }
            if (isMapFull()) break; // если поле заполнилось, завершаем игру
            aiTurn(); // ход компьютера
            printMap(); // печать поля
            if (checkWin('O')) { // проверка победы компьютера
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) break;
        }
        System.out.println("Game Over");
    }


    public static boolean checkWin(char ox) { // Проверяем победу
        // Ищем заполненные горизонтальные линии
        if (map[0][0] == ox && map[0][1] == ox && map[0][2] == ox) return true;
        if (map[1][0] == ox && map[1][1] == ox && map[1][2] == ox) return true;
        if (map[2][0] == ox && map[2][1] == ox && map[2][2] == ox) return true;
        // Ищем заполненные вертикальные линии
        if (map[0][0] == ox && map[1][0] == ox && map[2][0] == ox) return true;
        if (map[0][1] == ox && map[1][1] == ox && map[2][1] == ox) return true;
        if (map[0][2] == ox && map[1][2] == ox && map[2][2] == ox) return true;
        // Ищем заполненные диагональные линии
        if (map[0][0] == ox && map[1][1] == ox && map[2][2] == ox) return true;
        if (map[2][0] == ox && map[1][1] == ox && map[0][2] == ox) return true;
        return false;        // если ни одной линии не нашли, значит игрок еще не победил
    }

    private static void humanTurn() { // ход человека
        int x, y;
        do {
            System.out.println("Введите координаты в формате Х и У");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellEmpty(x, y)); // пользователь вводит координаты до тех пор, пока не укажет на свободную ячейку
        map[y][x] = 'X'; // после чего ставим туда Х
    }

    private static boolean isMapFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == '*') return false; // если на поле нашли хотя бы одну *, значит поле еще не заполнилось
            }
        }
        return true;
    }

    private static void aiTurn() {
        int x, y;
        do { // компьютер пытается случайно выбрать незанятое поле для хода
            x = rand.nextInt(3);
            y = rand.nextInt(3);
        } while (!isCellEmpty(x, y));
        map[y][x] = 'O'; // как только ячейка найдена, ставим туда О
    }

    public static boolean isCellEmpty(int x, int y) { // проверка является ли ячейка свободной
        if (x < 0 || x > 2 || y < 0 || y > 2) return false; // если указаны неверные координаты, считаем что ячейка условно занята
        if (map[y][x] != '*') return false; // если в ячейке не *, значит занята
        return true; // ячейка свободна
    }

    // Продвинутый вариант проверки победы
    public static boolean checkLine(int x, int y, int vx, int vy, int l, char ox) {
        for (int i = 0; i < l; i++) {
            if (map[y + i * vy][x + i * vx] != ox) return false;
        }
        return true;
    }
    public static boolean checkWinCL(char ox) {
        for (int i = 0; i < 3; i++) {
            if (checkLine(0, i, 1, 0, 3, ox)) return true;
            if (checkLine(i, 0, 0, 1, 3, ox)) return true;
        }
        if (checkLine(0, 0, 1, 1, 3, ox)) return true;
        if (checkLine(0, 2, 1, -1, 3, ox)) return true;
        return false;
    }
}
