/*
Напишите класс, который принимает с клавиатуры 10 целых чисел и выводит на экран
информацию о том, сколько из них бьли положительными.
 */
package CycleFor;

import java.util.Scanner;

public class Task8 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        int input, score=0;

        for (int a = 0;a<15;a++) {
            input = scan.nextInt();
            if (input>0) {
                score++;
            }
        }
        System.out.println("Колличество положительных чисел: "+score);
    }
}
