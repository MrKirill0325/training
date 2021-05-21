/*
Напишите класс, который выводит на экран (в одну строку) 20 случайных
чисел из диапазона 27...73. Перед каждым значением, делящимся на 3
без остатка, следует вывести (вплотную к числу) символ «#»
 */
package CycleFor;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main (String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int min=27, max=73, result;

        for (int a=0;a<20;a++){

            result = random.nextInt(max-min+1)+min;

            if (result%3==0){
                System.out.print(result+ "#" + " ");
            } else {
                System.out.print(result + " ");
            }

        }
    }
}

