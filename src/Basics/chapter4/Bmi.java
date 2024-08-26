package Basics.chapter4;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height in meters: ");
        double height = input.nextDouble();

        System.out.print("Enter the weight in kilograms: ");
        double weight = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your BMI is " + bmi);
    }
}
