/*
Напишите класс, который выводит на экран (в одну строку) 15 случайных чисел из диапазона -20...+35.
После каждого отрицательного числа следует вывести (вплотную к числу) символ "?"(знак вопроса)
 */
package CycleFor;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main (String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int min=-20, max=35, result;

        for (int a=0;a<15;a++){

            result = random.nextInt(max-min+1)+min;

            if (result>0){
                System.out.print(result+" ");
            } else {
                System.out.print(result + "?" + " ");//если писать '?' то к result будет прибавляться 63 т.к. по таблице ASCII (?=63)  !!!
            }

        }
    }
}

