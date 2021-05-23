/*
Напишите класс, который выводит на экран (в одну строку) 19 случайных чисел из диапазона «однозначные числа».
 Каждое значение, равное О, следует вывести на экран «В окружении»
 (вплотную к числу, перед ним и после него) символов«%» (процент).
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
                System.out.print("%"+number+"%"+" ");
            } else {
                System.out.print(number + " ");
            }

        }
    }
}

