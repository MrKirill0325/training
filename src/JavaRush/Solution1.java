/*
Ввести с клавиатуры число N.
Считать N целых чисел и заполнить ими массив.
Найти минимальное число среди элементов массива и вывести в консоль.
 */
package JavaRush;

import java.util.Scanner;

public class Solution1 {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N, input;

        N = scan.nextInt();
        array = new int [N];

        for(int i=0;i<array.length;i++){
            input=scan.nextInt();
            array[i]=input;
        }

        int minValue = array[0];

        for(int i=1; i<array.length;i++) {
            if(array[i]<minValue){
                minValue=array[i];
            }
        }

        System.out.println(minValue);

    }
}
