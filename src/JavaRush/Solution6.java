/*
Создайте треугольный массив, где значение каждого элемента —
это сумма его индексов.

Например:
array[7][3] = 7 + 3 = 10,
array[3][0] = 3 + 0 = 3.

Выведи массив на экран в следующем виде:
0
1 2
2 3 4
3 4 5 6
4 5 6 7 8
5 6 7 8 9 10
...
Числа в строке разделены пробелом.
 */
package JavaRush;


public class Solution6 {

    public static int[][] result = new int[10][];

    public static void main (String[] args){

        for (int i=0;i<result.length;i++){
            result[i]=new int[i+1];
        }

        for (int i=0;i<result.length;i++){
            for (int j=0;j<=i;j++){
                result[i][j]=i+j;
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }


    }
}
