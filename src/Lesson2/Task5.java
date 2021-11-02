package Lesson2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        System.out.println("\nTask 5 - round double");
        System.out.println("\nInsert you double");

        double userIn = inputUser.nextDouble();
        int aroundUser = (int) userIn;
        long mathround = Math.round(userIn);

        System.out.println ("You double to int = " + aroundUser + "\n You math double to int = " + mathround);
    }
}
