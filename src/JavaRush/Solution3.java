/*
Считать 6 строк и заполнить ими массив strings.
Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
 */


package JavaRush;

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
    public static String[] strings;

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        strings=new String[6];

        for (int i = 0; i < strings.length; i++) {
            strings[i]=scan.nextLine();
//            System.out.print(strings[i] + ", ");
        }

        for (int i=0;i<strings.length;i++){
            for (int j=0;j<strings.length;j++){
                if (i != j && strings[i] != null && strings[j] != null && strings[i].equals(strings[j])){
                    strings[i]=null;
                    strings[j]=null;
                }
            }
        }
        System.out.println(Arrays.toString(strings));
    }
}





/*
public class Solution3 {
    public static String[] strings;

    public static void main(String[] args) {
        //заполнение массива
        strings = new String[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            strings[i] = scan.nextLine();
        }
        //удаление дублей
        for (int i = 0; i < 10; i++) { //хватать ячейку массива
            for (int x = 0; x < 10; x++) { //сравнивать её с оставшимися ячейками поочередно
                if (i != x && strings[i] != null && strings[x] != null && strings[i].equals(strings[x])) { //и если это дубль,
                    //удалить дубли
                    strings[i] = null;
                    strings[x] = null;
                }
            }

        }
//       Arrays.stream(strings).forEach(System.out::println);
        System.out.println(Arrays.toString(strings));
    }
}
*/

