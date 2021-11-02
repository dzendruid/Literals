package Lesson2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        System.out.println("Insert you value seconds");
        Scanner inputUser = new Scanner(System.in);

        int CONST_DEVIDE = 60;
        int seconds = inputUser.nextInt();
        int minutes = seconds/CONST_DEVIDE;
        int hours = minutes/CONST_DEVIDE;

        int secondsAfterMinutes = seconds%CONST_DEVIDE;
        int minutesAfterHours = minutes%CONST_DEVIDE;

        System.out.println(hours + " часов "+ minutesAfterHours + " минут " + secondsAfterMinutes + " секунд ");
    }
}
