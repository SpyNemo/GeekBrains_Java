package homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printString(10,10, "A","B","C","1","D");
    }

    public static void printString(int a, int b, String... s){
        for (String o: s){
            System.out.println(Arrays.toString(s));
        }
    }
}
