/*
Напишите класс, который генерирует 15 целых чисел в интервале от
-25 до 25, печатает их, а затем выводит на экран информацию о том,
сколько из них были:
• положительными;
• четными;
• однозначными.
 */
package CycleFor;

import java.util.Random;

public class Task10 {
    public static void main (String[] args){

        Random random = new Random();

        int input, min = -25, max = 25, singleDigit=0, positiveNumber=0, evenNumber=0;

        for (int a=0;a<15;a++) {
            input = random.nextInt(max-min+1)+min;
            System.out.print(input+" ");
            if (input>0){
                positiveNumber++;
            }
            if (input%2==0) {
                evenNumber++;
            }
            if (input>-10 & input<10){
                singleDigit++;
            }
        }
        System.out.println();
        System.out.println("Положительные числа "+positiveNumber);
        System.out.println("Четные числа: "+evenNumber);
        System.out.println("Однозначные числа "+singleDigit);
    }
}
