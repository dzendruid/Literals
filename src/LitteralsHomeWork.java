import java.util.Scanner;

public class LitteralsHomeWork {
    public static void main(String[] args) {

        System.out.println("Task 1 - positive or negative value \n");
        System.out.println("Insert you number \n");
        Scanner inputUser = new Scanner(System.in);
        int userInt = inputUser.nextInt();
        System.out.println("You number is  " + (userInt>0));

        System.out.println("\n\n Task 2 - convertion from int");
        int varIntByte = 127;
        int varIntByte2 = 128;
        byte byteFromInt = (byte) varIntByte;
        byte biteFromInt2 = (byte) varIntByte2;
        System.out.println("Out convertion variable from value 127 =" + byteFromInt +"\n+ Out convertion variable from value 128 =" + biteFromInt2);

        System.out.println("\n\n Task 3 - dividing two variable");
        System.out.println("insert first variable");
        int variable1 = inputUser.nextInt();
        System.out.println("insert second variable");
        double variable2 = inputUser.nextInt();
        System.out.println("You result = " +(variable1/variable2));

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



        System.out.println("\nTask 6 - small or bigger value");
        System.out.println("\n Insert you first value");
        int uservalue1 = inputUser.nextInt();
        System.out.println("Insert you next value");
        int userValue2 = inputUser.nextInt();

        int resultMathMax = Math.max(uservalue1, userValue2);
        int resultMathMin = Math.min(uservalue1, userValue2);
        System.out.println("You max value = " + resultMathMax + "\nYou min value = " + resultMathMin);

        System.out.println("\nTask 8 - money");
        System.out.println("\nInsert you value");
        int userInputMoney = inputUser.nextInt();
        double ruble = userInputMoney/100;
        int rubleFromDouble = (int) ruble;
        int lastPart = userInputMoney%100;
        System.out.println(rubleFromDouble + " рублей " + lastPart+ " копеек");


    }
}