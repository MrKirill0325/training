package JavaRush;

import java.util.Arrays;

public class Solution8 {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {

        int[] arrayNew=Arrays.copyOf(array,array.length);

        Arrays.sort(arrayNew);

        int result = Arrays.binarySearch(arrayNew,element);

        System.out.println(result >= 0);
    }
}
