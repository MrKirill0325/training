/*
Напишите класс, который выводит на экран все целые положительные
двузначные числа, в которых разница между первой (число десятков) и
последней (число единиц) цифрами не превышает 3.
Класс должен также подсчитать количество этих чисел и вывести результат на экран
вместе с соответствующим текстовым сообщением.
 */
package CycleFor;

import java.util.Random;

public class Task11 {
    public static void main (String[] args){

        int q,w,e,count=0;

        for (int a=10;a<100;a++) {

            q=a/10;
            w=a%10;

            if (q>w){
                e=q-w;
            } else {
                e=w-q;
            }
            if (e<=3){
                System.out.print(a+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Колличество чисел "+count);
    }
}
