package Lesson2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        System.out.println("\nTask 8 - money");
        System.out.println("\nInsert you value");

        int userInputMoney = inputUser.nextInt();

        double ruble = userInputMoney/100;
        int rubleFromDouble = (int) ruble;
        int lastPart = userInputMoney%100;

        System.out.println(rubleFromDouble + "рублей " + lastPart+ "копеек");
    }
}
