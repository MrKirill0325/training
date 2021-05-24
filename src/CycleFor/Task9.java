/*
Напишите класс, который принимает с клавиатуры 15 целых чисел и
выводит на экран информацию о том, сколько из них были четными и
сколько нечетными.
 */
package CycleFor;

import java.util.Scanner;

public class Task9 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int evenNumber=0, oddNumber=0, input;

        for (int a=0;a<15;a++) {
            input = scan.nextInt();

            if (input%2==0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
        }
        System.out.println("Четных чисел "+evenNumber);
        System.out.println("Нечетных чисел "+oddNumber);

    }
}
