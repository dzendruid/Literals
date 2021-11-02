package Lesson2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("\n\n Task 4 - check triangle");

        int triangle = 180;
        System.out.println("\nInput first corner value");
        int corner1 = inputUser.nextInt();

        System.out.println("\nInput second corner value");
        int corner2 = inputUser.nextInt();

        System.out.println("\nInput third corner value");
        int corner3 = inputUser.nextInt();

        int result = corner1 + corner2 + corner3;

        if (triangle > result)
        {
            System.out.println("\nYou triangle is avalible sum of corner = " + result);
        }
        else
        {
            System.out.println("\nYou triangle is not avalible sum of corner = " + result);
        }

    }
}
