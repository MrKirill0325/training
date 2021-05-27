/*
Серия случайных чисел называется «уравновешенной», если количество положительных
и отрицательных чисел в серии - одинаково.
Напишите класс, который генерирует серию из 30 случайных целых
чисел из диапазона от -20 до 20 и проверяет, является ли серия «уравновешенной)>.
 */
package CycleFor;

import java.util.Random;

public class Task13 {
    public static void main (String[] args) {

        Random random = new Random();

        int min=-20, max=20, push, countFirst=0, countSecond=0;

        for (int a=0;a<30;a++) {
            push = random.nextInt(max-min+1)+min;

            push+=push;

            System.out.print(push+" ");
            if (push>0 || push==0){
                countFirst++;
            } else {
                countSecond++;
            }
        }
        System.out.println();
        System.out.println("Положительных "+countFirst);
        System.out.println("Отрицательных "+countSecond);

        if (countFirst==countSecond){
            System.out.println("Серия чесел уравновешенная");
        } else {
            System.err.println("Серия чесел не уравновешенная");
        }

    }
}
