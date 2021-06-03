/*
Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив array.
Найти максимальное число среди элементов массива.
 */
package JavaRush;

import java.util.Scanner;

public class Solution2 {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int input;

        array = new int[n];

        for (int i=0; i<array.length;i++){
            input=scan.nextInt();
            array[i]=input;
        }

        int max=array[0];

        for (int i=1; i<array.length;i++){
            if (max<array[i]){
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
