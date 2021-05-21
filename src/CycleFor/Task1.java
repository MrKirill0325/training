/*
Напишите класс, который выполняет следующие действия:
1. Принимает с клавиатуры два целых числа.
2. Создает и выводит на экран 20 случайных чисел в диапазоне от
первого, только что введенного с клавиатуры, значения, - до второго значения, также введенного с клавиатуры перед этим. Можно исходить из предположения, что первое из вводимых чисел
всегда меньше второго.
Например, если с клавиатуры были введены значения -8 и 17, то класс
создает 20 случайных чисел в диапазоне от -8 до 17 (включая сами эти
значения).
*/
package CycleFor;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main (String [] args){

        int max, min, result;

        min = scanner.nextInt();
        max = scanner.nextInt();

        for(int b=0;b<21;b++){
            result = random.nextInt(max-min+1)+min;
            System.out.println(result);

        }

    }
}
