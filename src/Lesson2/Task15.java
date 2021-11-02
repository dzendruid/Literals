package Lesson2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        System.out.println("Insert you a,b,c\n");

        System.out.println("Insert a\n");
        double a = inputUser.nextDouble();

        System.out.println("Insert b\n");
        double b = inputUser.nextDouble();

        System.out.println("Insert c\n");
        double c = inputUser.nextDouble();

        double result = ((b + Math.sqrt(Math.pow(b,2)) + 4 * a * c) / (2 * a)) - a * 3 * c + Math.pow(b, -3);
        System.out.println("You result = " + result);

    }
}
