package Lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        System.out.println("\n\n Task 3 - dividing two variable");
        System.out.println("insert first variable");
        int variable1 = inputUser.nextInt();
        System.out.println("insert second variable");
        double variable2 = inputUser.nextInt();
        System.out.println("You result = " +(variable1/variable2));

    }
}
