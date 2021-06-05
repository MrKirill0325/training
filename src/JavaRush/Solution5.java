package JavaRush;

import java.util.Scanner;

public class Solution5 {

    public static Scanner scanner = new Scanner(System.in);
    public static int[][] multiArray;

    public static void main (String[] args){

        int n=scanner.nextInt();

        multiArray = new int[n][];
        for (int i=0; i<n;i++){
            int numberColumn = scanner.nextInt();
            multiArray[i] = new int [numberColumn];
        }
    }
}


/*
РЕШЕНИЕ JAVARUSH
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        multiArray = new int[n][];
        for (int i = 0; i < n; i++) {
            int size = Integer.parseInt(scanner.nextLine());
            multiArray[i] = new int[size];
        }
    }
 */