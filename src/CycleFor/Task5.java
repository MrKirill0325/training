/*
Напишите класс, который выводит на экран (в одну строку) 20 случайных
чисел из диапазона 27...73. Перед каждым значением, делящимся на 3
без остатка, следует вывести (вплотную к числу) символ «#»
 */
package CycleFor;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main (String[] args){

        Random random = new Random();

        int min=0, max=9, number;

        for (int a=0;a<19;a++) {

            number = random.nextInt(max-min+1)+min;

            if (number==0) {
                System.out.print(number+"%"+" ");
            } else {
                System.out.print(number + " ");
            }

        }
    }
}

