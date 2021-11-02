package Lesson2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        System.out.println("\nTask 6 - small or bigger value");

        System.out.println("\n Insert you first value");
                int uservalue1 = inputUser.nextInt();

        System.out.println("Insert you next value");
        int userValue2 = inputUser.nextInt();

        int resultMathMax = Math.max(uservalue1, userValue2);
        int resultMathMin = Math.min(uservalue1, userValue2);
        System.out.println("You max value = " + resultMathMax + "\nYou min value = " + resultMathMin);
    }
}
