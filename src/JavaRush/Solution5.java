/*
Двумерный массив — это массив массивов,
то есть в каждой его ячейке находится ссылка на некий массив.
Но гораздо проще его представить в виде таблицы,
у которой задано количество строк (первое измерение) и количество столбцов (второе измерение).
Реализуйте метод main(String[]), который:

Считывает из консоли число N — количество строк массива. Число должно быть больше 0.
Потом считывает N чисел из консоли (любые числа больше 0).
Затем инициализирует двумерный массив multiArray:
количеством строк N;
строки — массивами, размер которых соответствует числам, введенным в п.2 (в порядке ввода).

Пример:
Введено число 5.
Введены числа 1, 7, 5, 9, 3.
Получаем такой массив:
[]
[][][][][][][]
[][][][][]
[][][][][][][][][]
[][][]
 */
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