package Lesson2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        System.out.println("insert number of Years");

        int yearNumber = inputUser.nextInt();
        System.out.println("Счастливого Рождества и Нового " +yearNumber+ " Года!!! Дед Мороз!");
    }
}