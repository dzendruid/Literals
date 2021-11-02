package Lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Task 1 - positive or negative value \n");
        System.out.println("Insert you number \n");
        Scanner inputUser = new Scanner(System.in);
        int userInt = inputUser.nextInt();
        System.out.println("You number is  " + (userInt>0));
    }
}