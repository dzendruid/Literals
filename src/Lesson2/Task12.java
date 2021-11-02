package Lesson2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        System.out.println("function is ((a-3)*b/a)+c Insert you a,b,c\n");

        System.out.println("Insert a\n");
        double a = inputUser.nextDouble();

        System.out.println("Insert b\n");
        double b = inputUser.nextDouble();

        System.out.println("Insert c\n");
        double c = inputUser.nextDouble();

        double result = ((a-3)*b/a)+c;
        System.out.println("you result from ((a-3)*b/a)+c = " + result);
    }
}
