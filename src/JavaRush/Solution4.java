/*
Проинициализируйте массив MULTIPLICATION_TABLE значением new int[10][10],
заполните его таблицей умножения и выведите в консоли
 */
package JavaRush;

import java.util.Arrays;

public class Solution4 {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE= new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                MULTIPLICATION_TABLE [i][j] = (i+1)*(j+1);
                System.out.print(MULTIPLICATION_TABLE[i][j]+" ");
            }
            System.out.println();

        }

    }
}
