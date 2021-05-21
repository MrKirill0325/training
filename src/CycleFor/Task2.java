/*
Напишите вариант предыдущей задачи(Task1), исходя из того, что неизвестно,
какое из вводимых с клавиатуры значений больше, а какое - меньше.
 */
package CycleFor;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        int one, two, max, min, result;

        one = scanner.nextInt();
        two = scanner.nextInt();

        if (one>two){
            min=two;
            max=one;
        } else {
            min=one;
            max=two;
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

        for(int b=0;b<21;b++){
            result = random.nextInt(max-min+1)+min;
            System.out.println(result);

        }
    }
}
