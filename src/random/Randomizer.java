package random;

import java.util.Random;
import java.util.Scanner;

public class Randomizer {
    public static Scanner scan = new Scanner(System.in);
    static Random random = new Random();


    public static void main(String[] args) {
        int input, a, b, c, d, max, min;
        System.out.println("Введите min границу диапазона");
        min = scan.nextInt();
        System.out.println("Введите max границу диапазона");
        max = scan.nextInt();
        a = random.nextInt(max-min+1)+min;
        b = random.nextInt(max-min+1)+min;
        System.out.println(a + " " + b);
        if (a>b)
            System.out.println("Число " + a + " больше " + b);
        else
            System.out.println("Число " + b + " больше " + a);



    }
}

