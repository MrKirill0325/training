/*
Напишите класс, который выводит на экран (в одну строку) 11 случайных чисел из диапазона «положительные двузначные».
После каждого числа, делящегося на 5 без остатка, следует вывести (в обычных скобках,
вплотную к числу) сумму его цифр; для остальных чисел следует вывести
произведение его цифр (в квадратных скобках, вплотную к числу).
 */
package CycleFor;

import java.util.Random;

public class Task6 {
    public static void main (String[] args){

        Random random = new Random();
        int min=10, max=99, randomNumber, one, two, sum;

        for (int a=0;a<11;a++){
            randomNumber = random.nextInt(max-min+1)+min;

            if(randomNumber%5==0){
                one = randomNumber/10;
                two = randomNumber%10;
                sum = one+two;
                System.out.print(randomNumber+"("+sum+") ");
            } else {
                one = randomNumber/10;
                two = randomNumber%10;
                sum = one*two;
                System.out.print(randomNumber+"["+sum+"] ");
            }
        }
    }
}

