/*
Реализуй метод main(String[]), который делит массив array на два подмассива и заполняет ими двухмерный массив result.
Если длина массива нечетная, то большую часть нужно скопировать в первый подмассив.
Для разделения массива используй метод Arrays.copyOfRange(int[], int, int). Порядок элементов не меняй.
При тестировании значения полей класса Solution будут разными, учти это.
 */
package JavaRush;

import java.util.Arrays;

public class Solution10 {
    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};


    public static void main(String[] args) {

        if (array.length%2==0){
            int[] firstArray = Arrays.copyOfRange(array,0,array.length/2);
            int[] secondArray = Arrays.copyOfRange(array,array.length/2,array.length);
            result[0]=firstArray;
            result[1]=secondArray;
        } else {
            int[] firstArray = Arrays.copyOfRange(array,0,array.length/2+1);
            int[] secondArray = Arrays.copyOfRange(array,array.length/2+1,array.length);
            result[0]=firstArray;
            result[1]=secondArray;
        }

        System.out.println(Arrays.deepToString(result));

    }
}
