/*
Напишите класс, который принимает для каждого из 1234 учеников
района дату его рождения (день, месяц, год). Класс должен подсчитать
и вывести на экран число детей, родившихся зимой, весной, летом и
осенью.
 */
package CycleFor;

import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main (String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int day, month, year, dayMin=1, dayMax=30, monthMin=1, monthMax=12, yearMin, yearMax, countSpring=0, countSummer=0, countFall=0, countWinter=0;

        System.out.println("Искать учеников родившихся в года");
        System.out.print("с ");
        yearMin = scan.nextInt();
        System.out.print("по ");
        yearMax = scan.nextInt();
        System.out.println();

        for (int a=0;a<1000;a++) {
            year = random.nextInt(yearMax-yearMin+1)+yearMin;
            month = random.nextInt(monthMax-monthMin+1)+monthMin;
            if(month==2){
                dayMax=28;
            }
            day = random.nextInt(dayMax-dayMin+1)+dayMin;
            System.out.println(day+"."+month+"."+year+" год");

            if (month==3 || month==4 || month==5) {
                countSpring++;
            }
            if (month==6 || month==7 || month==8){
                countSummer++;
            }
            if (month==9 || month==10 || month==11){
                countFall++;
            }
            if (month==12 || month==1 || month==2){
                countWinter++;
            }
        }
        System.out.println("Учеников родившихся весной "+countSpring);
        System.out.println("Учеников родившихся летом "+countSummer);
        System.out.println("Учеников родившихся осенью "+countFall);
        System.out.println("Учеников родившихся зимой "+countWinter);
    }
}
