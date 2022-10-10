package ie.atu.week4;

import java.util.Scanner;

public class Calc2022
{
    public static void main(String[] args)
    {
        System.out.println("Enter a Number");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("You entered : " + firstNumber);

        System.out.println("Enter Second Number");
        int secondNumber = input.nextInt();
        System.out.println("You entered : " + secondNumber);

        int total = firstNumber + secondNumber;
        System.out.println("Total number is : " + total);

    }

}
